package com.sin.lineage.parser.listener;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.Assert;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.sin.lineage.antlr.clickhouse.ClickHouseParser;
import com.sin.lineage.antlr.clickhouse.ClickHouseParserBaseListener;
import com.sin.lineage.parser.exception.LineageException;
import com.sin.lineage.parser.struct.Column;
import com.sin.lineage.parser.struct.Statement;
import com.sin.lineage.parser.struct.Table;
import com.sin.lineage.parser.struct.graph.Node;
import com.sin.lineage.parser.struct.meta.TableMeta;
import org.antlr.v4.runtime.RuleContext;
import org.jgrapht.Graphs;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * ClickHouse血缘解析监听器
 *
 * @author yesin
 * @date 2025/3/13
 */
public class ClickHouseLineageParserListener extends ClickHouseParserBaseListener {

    /**
     * 存储血缘的图
     * <pre><code>
     * 语句：
     * select id from t_user
     * 在图中的存储结构为：
     * stmt0.id -> t_user.id
     * </code></pre>
     */
    private final SimpleDirectedGraph<Node, DefaultEdge> g;

    /**
     * 存储语句间的作用域关系图
     */
    private final SimpleDirectedGraph<String, DefaultEdge> statementGraph;

    private Integer stmtIndex = 0;
    private Integer columnSubqueryIndex = 1;

    private final Map<RuleContext, Statement> stmtMap = Maps.newHashMap();
    private final Map<String, Statement> stmtNameMap = Maps.newHashMap();

    /**
     * 存储表名和表拥有的列的映射关系
     */
    private final Map<String, List<String>> tableMap = Maps.newHashMap();

    /**
     * 真实表
     */
    private final List<String> realTables = Lists.newArrayList();

    /**
     * 存储血缘的目标表名，默认为stmt0，如果有insert，则是插入表的名称
     */
    private String sinkTableName = "stmt0";

    public ClickHouseLineageParserListener(List<TableMeta> tableMetas) {
        g = new SimpleDirectedGraph<>(DefaultEdge.class);
        statementGraph = new SimpleDirectedGraph<>(DefaultEdge.class);
        if (CollUtil.isNotEmpty(tableMetas)) {
            tableMetas.forEach(tableMeta -> {
                tableMap.put(tableMeta.getName(), tableMeta.getColumns());
                realTables.add(tableMeta.getName());
            });
        }
    }

    /**
     * 获取血缘解析结果
     *
     * @return 血缘解析结果
     */
    public Pair<SimpleDirectedGraph<Node, DefaultEdge>, String> getParserResult() {
        return Pair.of(g, sinkTableName);
    }

    /**
     * 解析insert语句
     */
    @Override
    public void enterInsertStmt(ClickHouseParser.InsertStmtContext ctx) {
        Statement statement = new Statement();

        // 解析insert表
        Table table = parseTableIdentifier(ctx.tableIdentifier());
        statement.setSinkTable(table);
        sinkTableName = table.getName();

        // 解析insert的列
        statement.addColumns(parseColumnsClause(ctx.columnsClause()));

        // 添加source表
        if (ctx.dataClause() instanceof ClickHouseParser.DataClauseSelectContext instanceCtx) {
            Statement srcStatement = new Statement();
            Table sourceTable = new Table(generateStmtName());
            srcStatement.setSinkTable(sourceTable);

            statement.addSourceTable(sourceTable);
            stmtMap.put(ctx, statement);
            stmtMap.put(instanceCtx.topSelectStmt(), srcStatement);

            stmtNameMap.put(statement.getStatementName(), statement);
            stmtNameMap.put(srcStatement.getStatementName(), srcStatement);
        }
    }

    /**
     * CTE语句
     */
    @Override
    public void enterCteStmt(ClickHouseParser.CteStmtContext ctx) {
        // 先设置CTE语句的 with .. select ...的 select名称
        Statement statement = getStatementOfTopContext(ctx);
        if (statement.getSinkTable() == null) {
            statement.setSinkTable(new Table(generateStmtName()));
        }
    }

    /**
     * 处理insert语句的列血缘
     */
    @Override
    public void exitInsertStmt(ClickHouseParser.InsertStmtContext ctx) {
        Statement statement = stmtMap.get(ctx);
        if (statement.getSourceTable().isEmpty()) {
            return;
        }

        Table sourceTable = statement.getSourceTable().get(0);
        List<String> srcColumns = tableMap.get(sourceTable.fullName());

        // insert into没有定义列的情况
        List<Column> stmtColumns = statement.getColumns();
        if (stmtColumns.isEmpty()) {
            List<String> sinkColumns = tableMap.get(statement.getSinkTable().getName());
            List<Column> insertColumns = sinkColumns.subList(0, srcColumns.size()).stream().map(v -> {
                Column column = new Column(v);
                column.setIdentifier(sourceTable.getName());
                return column;
            }).toList();
            stmtColumns.addAll(insertColumns);
        }

        if (stmtColumns.size() != srcColumns.size()) {
            throw new LineageException("insert与select的列数量不匹配");
        }

        // 按照列顺序添加血缘
        for (int i = 0; i < stmtColumns.size(); i++) {
            Node srcNode = new Node(statement.getSinkTable().getName(), stmtColumns.get(i).getName());
            Node tgtNode = new Node(sourceTable.getName(), srcColumns.get(i));
            Graphs.addEdgeWithVertices(g, srcNode, tgtNode);
        }
    }

    /**
     * 解析select语句
     */
    @Override
    public void enterSelectStmt(ClickHouseParser.SelectStmtContext ctx) {
        Statement statement = getStatementOfTopContext(ctx);

        // 添加sink表
        if (statement.getSinkTable() == null) {
            statement.setSinkTable(new Table(generateStmtName()));
        }
        stmtNameMap.put(statement.getStatementName(), statement);

        // 处理语句图
        processStatementGraph(ctx);

        // 解析列
        List<Column> columns = parseColumnExprList(ctx.columnExprList());
        if (isUnionStmt(ctx)) {
            processUnionStmt(columns, statement);
        } else {
            statement.addColumns(columns);
        }
    }

    /**
     * 在退出语句时解析列血缘
     */
    @Override
    public void exitSelectStmt(ClickHouseParser.SelectStmtContext ctx) {
        Statement statement = getStatementOfTopContext(ctx);

        // 追溯来源表
        traceSourceTable(statement);

        List<Column> expandColumns = Lists.newArrayList();
        statement.getColumns().forEach(col -> {
            // 拓展*列为具体的列
            if ("*".equals(col.getName())) {
                expandStarColumn(col, statement, expandColumns);
            } else {
                expandColumns.add(col);
            }
        });
        statement.setColumns(expandColumns);

        // 添加sink表拥有的列
        if (!tableMap.containsKey(statement.getSinkTable().getName())) {
            List<String> columns = expandColumns.stream()
                    .map(Column::getName)
                    .toList();
            tableMap.put(statement.getSinkTable().getName(), columns);
        }

        // 解析列血缘
        parseColumnLineage(statement);
    }

    /**
     * 处理union语句
     */
    private void processUnionStmt(List<Column> columns, Statement statement) {
        if (!statement.getColumns().isEmpty()) {
            // 使用第一个select的列作为别名
            Assert.isTrue(statement.getColumns().size() == columns.size(), "union语句中select的列数不一致");
            for (int i = 0; i < statement.getColumns().size(); i++) {
                Column column = columns.get(i);
                if (CollUtil.isEmpty(column.getSourceColumns())) {
                    Column result = new Column(column.getIdentifier(), column.getName());
                    result.setIsSubquery(column.getIsSubquery());
                    column.addSourceColumn(result);
                }
                column.setIdentifier(null);
                column.setName(statement.getColumns().get(i).getName());
            }
        }
        statement.setColumns(columns);

        // 清理上一个select的表信息
        statement.getSourceTable().clear();
    }

    /**
     * 判断是否属于union语句
     */
    private boolean isUnionStmt(ClickHouseParser.SelectStmtContext ctx) {
        RuleContext parent = ctx.getParent();
        while (parent != null) {
            if (parent instanceof ClickHouseParser.SelectUnionStmtContext) {
                return true;
            }

            if (parent instanceof ClickHouseParser.TopSelectStmtContext) {
                return false;
            }

            parent = parent.getParent();
        }

        return false;
    }

    /**
     * 追溯来源表
     */
    private void traceSourceTable(Statement currentStatement) {
        List<Table> list = currentStatement.getSourceTable().stream()
                .map(table -> {
                    // 先从真实表中找
                    if (realTables.contains(table.getName())) {
                        return table.copy();
                    }

                    if (table.getAlias() != null) {
                        // 在从下一层作用域中找是子查询的表
                        Table result = findTableFromSubStatement(table.getName(), currentStatement);
                        if (result != null) {
                            result.setAlias(table.getAlias());
                            return result;
                        }

                        Table result2 = findTableOfQueryScope(table.getName(), currentStatement);
                        result2.setAlias(table.getAlias());
                        return result2;
                    }

                    Table result = findTableFromSubStatement(table.getName(), currentStatement);
                    if (result != null) {
                        return result;
                    }

                    // 从作用域中找
                    return findTableOfQueryScope(table.getName(), currentStatement);
                })
                .collect(Collectors.toList());
        currentStatement.setSourceTable(list);
    }

    /**
     * 从子statement中找到表
     */
    private Table findTableFromSubStatement(String tableName, Statement currentStatement) {
        List<String> statementNames = Graphs.predecessorListOf(statementGraph, currentStatement.getStatementName());
        for (String statementName : statementNames) {
            Statement statement = getStatementByName(statementName);

            Table sinkTable = statement.getSinkTable();
            if (Objects.equals(sinkTable.getName(), tableName) || Objects.equals(sinkTable.getAlias(), tableName)) {
                return statement.getSinkTable().copy();
            }
        }

        return null;
    }

    /**
     * 从父statement的子statement中查找表
     */
    private Table findTableOfQueryScope(String tableName, Statement currentStatement) {
        List<String> parents = Graphs.successorListOf(statementGraph, currentStatement.getStatementName());
        if (parents.isEmpty()) {
            throw new LineageException("未在查询作用域中找到对应的表 " + tableName);
        }

        // 从上一层作用域中查找
        String parentName = parents.get(0);
        List<String> subStmtList = Graphs.predecessorListOf(statementGraph, parentName);

        for (String subStmtName : subStmtList) {
            if (Objects.equals(subStmtName, currentStatement.getStatementName())) {
                continue;
            }

            Statement subStmt = getStatementByName(subStmtName);
            if (Objects.equals(tableName, subStmt.getSinkTable().getAlias())) {
                return subStmt.getSinkTable().copy();
            }
        }

        // 找不到继续往上一层作用域查找
        return findTableOfQueryScope(tableName, getStatementByName(parentName));
    }

    /**
     * 通过名称获取Statement
     */
    private Statement getStatementByName(String name) {
        Statement result = stmtNameMap.get(name);
        if (result == null) {
            throw new IllegalArgumentException(String.format("获取%s的Statement失败", name));
        }

        return result;
    }

    /**
     * 拓展*列，将*列展开成具体的列
     */
    private void expandStarColumn(Column starColumn, Statement statement, List<Column> expandColumns) {
        if (starColumn.getIdentifier() != null) {
            Table srcTable = statement.getSourceTable().stream()
                    .filter(v -> v.getAlias() == null ? v.getName().equals(starColumn.getIdentifier())
                            : v.getAlias().equals(starColumn.getIdentifier()))
                    .findFirst()
                    .orElseThrow(() -> new LineageException(String.format("找不到列标识符 %s 对应的表", starColumn.getIdentifier())));
            tableMap.getOrDefault(srcTable.getName(), Collections.emptyList()).stream()
                    .map(v -> new Column(starColumn.getIdentifier(), v))
                    .forEach(expandColumns::add);
        } else {
            statement.getSourceTable()
                    .forEach(srcTable -> tableMap.getOrDefault(srcTable.getName(), Collections.emptyList()).stream()
                            .map(srcCol -> new Column(srcTable.getName(), srcCol))
                            .forEach(expandColumns::add));
        }
    }

    /**
     * 解析列血缘
     */
    private void parseColumnLineage(Statement statement) {
        statement.getColumns().forEach(column -> {
            // 处理列是子查询的情况
            if (column.getIsSubquery()) {
                parseLineageOfColumnSubquery(statement, column);
                return;
            }

            if (CollUtil.isEmpty(column.getSourceColumns())) {
                processSingleSource(statement, column, column);
            } else {
                column.getSourceColumns().forEach(srcColumn -> processSingleSource(statement, srcColumn, column));
            }
        });
    }

    /**
     * 解析列子查询的血缘
     */
    private void parseLineageOfColumnSubquery(Statement statement, Column subqueryColumn) {
        Statement subqueryStatement = stmtMap.values().stream()
                .filter(v -> Objects.equals(subqueryColumn.getName(), v.getSinkTable().getAlias()))
                .findFirst()
                .orElseThrow(() ->
                        new LineageException(String.format("找不到列%s对应的子查询statement", subqueryColumn.getName())));
        addLineageEdge(statement.getSinkTable(), subqueryColumn, subqueryStatement.getSinkTable(), subqueryStatement.getColumns().get(0));
    }

    /**
     * 处理单个来源列到目标列的映射关系
     */
    private void processSingleSource(Statement statement, Column sourceColumn, Column targetColumn) {
        if (sourceColumn.getIsSubquery()) {
            Statement subqueryStatement = stmtMap.values().stream()
                    .filter(v -> Objects.equals(sourceColumn.getName(), v.getSinkTable().getAlias()))
                    .findFirst()
                    .orElseThrow(() ->
                            new LineageException(String.format("找不到列%s对应的子查询statement", sourceColumn.getName())));
            addLineageEdge(statement.getSinkTable(), targetColumn, subqueryStatement.getSinkTable(), subqueryStatement.getColumns().get(0));
            return;
        }

        Table readTable = sourceColumn.getIdentifier() != null
                ? findTableByIdentifier(statement, sourceColumn.getIdentifier())
                : findTableByColumnName(statement, sourceColumn.getName());

        if (Objects.nonNull(readTable)) {
            addLineageEdge(statement.getSinkTable(), targetColumn, readTable, sourceColumn);
        }
    }

    /**
     * 根据标识符查找表
     */
    private Table findTableByIdentifier(Statement statement, String identifier) {
        return statement.getSourceTable().stream()
                .filter(v -> identifier.equals(v.getAlias()) || identifier.equals(v.getName()))
                .findFirst()
                .orElseThrow(() ->
                        new IllegalArgumentException(String.format("找不到标识符%s对应的读表", identifier)));
    }

    /**
     * 根据列名查找表
     */
    private Table findTableByColumnName(Statement statement, String columnName) {
        return statement.getSourceTable().stream()
                .filter(v -> tableMap.getOrDefault(v.getName(), Collections.emptyList())
                        .contains(columnName))
                .findFirst()
                .orElse(null);
    }

    /**
     * 添加列级血缘关系到图结构
     */
    private void addLineageEdge(Table sinkTable, Column targetColumn, Table readTable, Column sourceColumn) {
        Node stmtNode = new Node(sinkTable.getName(), targetColumn.getName());
        Node readNode = new Node(readTable.getName(), sourceColumn.getName());
        Graphs.addEdgeWithVertices(g, stmtNode, readNode);
    }

    /**
     * 解析from表
     *
     * <pre>
     * joinExpr
     *     : joinExpr (GLOBAL | LOCAL)? joinOp? JOIN joinExpr joinConstraintClause  # JoinExprOp
     *     | joinExpr joinOpCross joinExpr                                          # JoinExprCrossOp
     *     | tableExpr FINAL? sampleClause?                                         # JoinExprTable
     *     | LPAREN joinExpr RPAREN                                                 # JoinExprParens
     *     ;
     * </pre>
     */
    @Override
    public void enterFromClause(ClickHouseParser.FromClauseContext ctx) {
        ClickHouseParser.JoinExprContext joinExprCtx = ctx.joinExpr();
        Statement statement = getStatementOfTopContext(ctx);

        statement.addSourceTables(parseJoinExpr(joinExprCtx));
    }

    /**
     * <pre>
     * joinExpr
     *     : joinExpr (GLOBAL | LOCAL)? joinOp? JOIN joinExpr joinConstraintClause  # JoinExprOp
     *     | joinExpr joinOpCross joinExpr                                          # JoinExprCrossOp
     *     | tableExpr FINAL? sampleClause?                                         # JoinExprTable
     *     | LPAREN joinExpr RPAREN                                                 # JoinExprParens
     *     ;
     * </pre>
     */
    private List<Table> parseJoinExpr(ClickHouseParser.JoinExprContext ctx) {
        if (ctx instanceof ClickHouseParser.JoinExprOpContext instanceCtx) {
            return instanceCtx.joinExpr().stream()
                    .flatMap(v -> parseJoinExpr(v).stream())
                    .toList();
        }

        if (ctx instanceof ClickHouseParser.JoinExprCrossOpContext instanceCtx) {
            return instanceCtx.joinExpr().stream()
                    .flatMap(v -> parseJoinExpr(v).stream())
                    .toList();
        }

        if (ctx instanceof ClickHouseParser.JoinExprTableContext instanceCtx) {
            Table table = parseTableExpr(instanceCtx.tableExpr());
            if (table == null) {
                return Lists.newArrayList();
            }

            return Lists.newArrayList(table);
        }

        if (ctx instanceof ClickHouseParser.JoinExprParensContext instanceCtx) {
            return parseJoinExpr(instanceCtx.joinExpr());
        }

        return Collections.emptyList();
    }

    private Statement getStatementOfTopContext(RuleContext ctx) {
        RuleContext parent = ctx;
        while (parent != null) {
            if (parent instanceof ClickHouseParser.TopSelectStmtContext) {
                // 判断是否是cte语句的item（即namedQuery）
                ClickHouseParser.NamedQueryContext namedQueryContext = getNamedQueryCtxOfCte(parent);
                if (namedQueryContext != null) {
                    Statement result = stmtMap.computeIfAbsent(parent, v -> new Statement());
                    if (result.getSinkTable() == null) {
                        Table sinkTable = new Table(generateStmtName());
                        sinkTable.setAlias(namedQueryContext.name.getText());
                        result.setSinkTable(sinkTable);
                    }

                    return result;
                }

                return stmtMap.computeIfAbsent(parent, v -> new Statement());
            }

            parent = parent.getParent();
        }

        throw new IllegalArgumentException("获取Statement失败");
    }

    private ClickHouseParser.TopSelectStmtContext getTopSelectStmtCtx(RuleContext ctx) {
        RuleContext parent = ctx.parent;
        while (parent != null) {
            if (parent instanceof ClickHouseParser.TopSelectStmtContext instanceCtx) {
                return instanceCtx;
            }

            parent = parent.getParent();
        }

        return null;
    }

    /**
     * 处理查询的拓扑关系图
     */
    private void processStatementGraph(ClickHouseParser.SelectStmtContext ctx) {
        // 获取当前ctx的topSelectContext
        ClickHouseParser.TopSelectStmtContext currentScope = getTopSelectStmtCtx(ctx);
        Statement currentStmt = getStatementOfTopContext(currentScope);

        // 获取topSelectStmtCtx的父TopSelectStmtContext
        assert currentScope != null;
        ClickHouseParser.TopSelectStmtContext parentScope = getTopSelectStmtCtx(currentScope);
        // 建立拓扑关系
        if (parentScope != null) {
            Graphs.addEdgeWithVertices(statementGraph, currentStmt.getStatementName(),
                    getStatementOfTopContext(parentScope).getStatementName());
        }
    }

    private ClickHouseParser.NamedQueryContext getNamedQueryCtxOfCte(RuleContext ctx) {
        RuleContext parent = ctx;

        while (parent != null) {
            if (parent instanceof ClickHouseParser.NamedQueryContext instanceCtx) {
                return instanceCtx;
            }
            parent = parent.getParent();
        }

        return null;
    }

    private List<Column> parseColumnsClause(ClickHouseParser.ColumnsClauseContext ctx) {
        if (ctx == null) {
            return Lists.newArrayList();
        }

        return ctx.nestedIdentifier().stream()
                .map(v -> removeDialect(new Column(v.getText())))
                .toList();
    }

    private List<Column> parseColumnExprList(ClickHouseParser.ColumnExprListContext ctx) {
        return ctx.columnsExpr().stream()
                .map(this::parseColumnsExpr)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    /**
     * <pre>
     * columnsExpr
     *     : (tableIdentifier DOT)? ASTERISK  # ColumnsExprAsterisk
     *     | LPAREN topSelectStmt RPAREN    # ColumnsExprSubquery
     *     // NOTE: asterisk and subquery goes before |columnExpr| so that we can mark them as multi-column expressions.
     *     | columnExpr                       # ColumnsExprColumn
     *     ;
     * </pre>
     */
    private Column parseColumnsExpr(ClickHouseParser.ColumnsExprContext ctx) {
        if (ctx instanceof ClickHouseParser.ColumnsExprAsteriskContext instanceCtx) {
            Column result = new Column("*");
            if (instanceCtx.tableIdentifier() != null) {
                Table table = parseTableIdentifier(instanceCtx.tableIdentifier());
                result.setIdentifier(table.getName());
            }

            return removeDialect(result);
        }

        if (ctx instanceof ClickHouseParser.ColumnsExprSubqueryContext instanceCtx) {
            Statement statement = getStatementOfTopContext(instanceCtx.topSelectStmt());
            Table sinkTable = new Table(generateStmtName());
            sinkTable.setAlias(generateColumnSubquery());
            statement.setSinkTable(sinkTable);
            Column result = new Column(sinkTable.getAlias());
            result.setIsSubquery(true);

            return (result);
        }

        if (ctx instanceof ClickHouseParser.ColumnsExprColumnContext instanceCtx) {
            Column result = parseColumnExpr(instanceCtx.columnExpr());
            if (Objects.isNull(result)) {
                return null;
            }
            return removeDialect(result);
        }

        return null;
    }

    private Column parseColumnExpr(ClickHouseParser.ColumnExprContext ctx) {
        if (ctx instanceof ClickHouseParser.ColumnExprCaseContext instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            instanceCtx.columnExpr().forEach(v -> result.addSourceColumns(getAllSourceColumns(parseColumnExpr(v))));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprCastContext instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            result.addSourceColumns(getAllSourceColumns(parseColumnExpr(instanceCtx.columnExpr())));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprExtractContext instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            result.addSourceColumns(getAllSourceColumns(parseColumnExpr(instanceCtx.columnExpr())));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprIntervalContext instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            result.addSourceColumns(getAllSourceColumns(parseColumnExpr(instanceCtx.columnExpr())));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprSubstringContext instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            instanceCtx.columnExpr().forEach(v -> result.addSourceColumns(getAllSourceColumns(parseColumnExpr(v))));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprTrimContext instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            result.addSourceColumns(getAllSourceColumns(parseColumnExpr(instanceCtx.columnExpr())));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprWinFunctionContext instanceCtx) {
            if (instanceCtx.columnExprList() == null) {
                return null;
            }


            Column result = new Column(instanceCtx.getText());
            parseColumnExprList(instanceCtx.columnExprList()).forEach(v -> result.addSourceColumns(getAllSourceColumns(v)));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprWinFunctionTargetContext instanceCtx) {
            if (instanceCtx.columnExprList() == null) {
                return null;
            }

            Column result = new Column(instanceCtx.getText());
            parseColumnExprList(instanceCtx.columnExprList()).forEach(v -> result.addSourceColumns(getAllSourceColumns(v)));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprFunctionContext instanceCtx) {
            return parseColumnExprFunction(instanceCtx);
        }

        if (ctx instanceof ClickHouseParser.ColumnExprArrayAccessContext instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            instanceCtx.columnExpr().forEach(v -> result.addSourceColumns(getAllSourceColumns(parseColumnExpr(v))));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprTupleAccessContext instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            result.addSourceColumns(getAllSourceColumns(parseColumnExpr(instanceCtx.columnExpr())));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprNegateContext instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            result.addSourceColumns(getAllSourceColumns(parseColumnExpr(instanceCtx.columnExpr())));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprPrecedence1Context instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            instanceCtx.columnExpr().forEach(v -> result.addSourceColumns(getAllSourceColumns(parseColumnExpr(v))));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprPrecedence2Context instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            instanceCtx.columnExpr().forEach(v -> result.addSourceColumns(getAllSourceColumns(parseColumnExpr(v))));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprPrecedence3Context instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            instanceCtx.columnExpr().forEach(v -> result.addSourceColumns(getAllSourceColumns(parseColumnExpr(v))));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprIsNullContext instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            result.addSourceColumns(getAllSourceColumns(parseColumnExpr(instanceCtx.columnExpr())));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprNotContext instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            result.addSourceColumns(getAllSourceColumns(parseColumnExpr(instanceCtx.columnExpr())));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprAndContext instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            instanceCtx.columnExpr().forEach(v -> result.addSourceColumns(getAllSourceColumns(parseColumnExpr(v))));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprOrContext instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            instanceCtx.columnExpr().forEach(v -> result.addSourceColumns(getAllSourceColumns(parseColumnExpr(v))));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprBetweenContext instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            instanceCtx.columnExpr().forEach(v -> result.addSourceColumns(getAllSourceColumns(parseColumnExpr(v))));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprTernaryOpContext instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            instanceCtx.columnExpr().forEach(v -> result.addSourceColumns(getAllSourceColumns(parseColumnExpr(v))));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprAliasContext instanceCtx) {
            String alias = instanceCtx.alias() != null ? instanceCtx.alias().getText() : instanceCtx.identifier().getText();
            Column result = new Column(alias);
            result.addSourceColumns(getAllSourceColumns(parseColumnExpr(instanceCtx.columnExpr())));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprSubqueryContext instanceCtx) {
            Statement statement = getStatementOfTopContext(instanceCtx.topSelectStmt());
            Table sinkTable = new Table(generateStmtName());
            sinkTable.setAlias(generateColumnSubquery());
            statement.setSinkTable(sinkTable);
            Column result = new Column(sinkTable.getAlias());
            result.setIsSubquery(true);
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprParensContext instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            result.addSourceColumns(getAllSourceColumns(parseColumnExpr(instanceCtx.columnExpr())));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprTupleContext instanceCtx) {
            Column result = new Column(instanceCtx.getText());
            instanceCtx.columnExprList().columnsExpr().stream()
                    .map(this::parseColumnsExpr)
                    .filter(Objects::nonNull)
                    .forEach(v -> result.addSourceColumns(getAllSourceColumns(v)));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprArrayContext instanceCtx) {
            if (instanceCtx.columnExprList() == null) {
                return null;
            }

            Column result = new Column(instanceCtx.getText());
            parseColumnExprList(instanceCtx.columnExprList()).forEach(v -> result.addSourceColumns(getAllSourceColumns(v)));
            return result;
        }

        if (ctx instanceof ClickHouseParser.ColumnExprIdentifierContext instanceCtx) {
            String name = instanceCtx.columnIdentifier().nestedIdentifier().getText();
            Column column = new Column(name);
            if (instanceCtx.columnIdentifier().tableIdentifier() != null) {
                column.setIdentifier(instanceCtx.columnIdentifier().tableIdentifier().identifier().getText());
            }
            return column;
        }

        return null;
    }

    /**
     * <pre>
     *     identifier (LPAREN columnExprList? RPAREN)? LPAREN DISTINCT? columnArgList? RPAREN  # ColumnExprFunction
     * </pre>
     */
    private Column parseColumnExprFunction(ClickHouseParser.ColumnExprFunctionContext ctx) {
        Column result = new Column(ctx.getText());
        if (ctx.columnArgList() != null) {
            ctx.columnArgList().columnArgExpr().forEach(v -> result.addSourceColumns(parseColumnArgExpr(v)));
        }

        if (ctx.columnExprList() != null) {
            ctx.columnExprList().columnsExpr()
                    .forEach(v -> result.addSourceColumns(getAllSourceColumns(parseColumnsExpr(v))));
        }
        return result;
    }

    private List<Column> parseColumnArgExpr(ClickHouseParser.ColumnArgExprContext ctx) {
        if (ctx.columnExpr() != null) {
            return Lists.newArrayList(getAllSourceColumns(parseColumnExpr(ctx.columnExpr())));
        }

        List<Column> result = Lists.newArrayList();
        ctx.columnLambdaExpr().identifier().forEach(v -> result.add(new Column(v.getText())));
        result.addAll(getAllSourceColumns(parseColumnExpr(ctx.columnLambdaExpr().columnExpr())));

        return result;
    }

    /**
     * <pre>
     * tableExpr
     *     : tableIdentifier                    # TableExprIdentifier
     *     | tableFunctionExpr                  # TableExprFunction
     *     | LPAREN selectUnionStmt RPAREN      # TableExprSubquery
     *     | tableExpr (alias | AS identifier)  # TableExprAlias
     *     ;
     * </pre>
     */
    private Table parseTableExpr(ClickHouseParser.TableExprContext ctx) {
        if (ctx instanceof ClickHouseParser.TableExprIdentifierContext instanceCtx) {
            return parseTableIdentifier(instanceCtx.tableIdentifier());
        }

        // 未解析 TableExprFunction

        if (ctx instanceof ClickHouseParser.TableExprSubqueryContext instanceCtx) {
            Statement statement = new Statement();
            Table result = new Table(generateStmtName());
            statement.setSinkTable(result);
            stmtMap.put(instanceCtx.topSelectStmt(), statement);
            return result;
        }

        if (ctx instanceof ClickHouseParser.TableExprAliasContext instanceCtx) {
            String tableAlias = instanceCtx.alias() == null ? instanceCtx.identifier().getText() : instanceCtx.alias().getText();
            Table result = parseTableExpr(instanceCtx.tableExpr());
            result.setAlias(tableAlias);
            return result;
        }

        return null;
    }

    /**
     * <pre>
     * tableIdentifier: (databaseIdentifier DOT)? identifier;
     * </pre>
     */
    private Table parseTableIdentifier(ClickHouseParser.TableIdentifierContext ctx) {
        Table result = new Table(ctx.identifier().getText());
        if (ctx.databaseIdentifier() != null) {
            result.setDbName(ctx.databaseIdentifier().getText());
        }

        return removeDialect(result);
    }

    private String generateStmtName() {
        return "stmt" + stmtIndex++;
    }

    private String generateColumnSubquery() {
        return "_subquery_" + columnSubqueryIndex++;
    }

    private List<Column> getAllSourceColumns(Column parent) {
        List<Column> result = Lists.newArrayList();
        if (parent != null) {
            getAllSourceColumns(parent, result);
        }
        return result;
    }

    private void getAllSourceColumns(Column parent, List<Column> sourceColumns) {
        if (CollUtil.isEmpty(parent.getSourceColumns())) {
            sourceColumns.add(parent);
            return;
        }

        parent.getSourceColumns().forEach(v -> getAllSourceColumns(v, sourceColumns));
    }

    /**
     * 移除方言
     */
    private Column removeDialect(Column column) {
        if (Objects.isNull(column)) {
            return null;
        }

        if (Objects.nonNull(column.getName())) {
            column.setName(removeDialect(column.getName()));
        }

        if (Objects.nonNull(column.getIdentifier())) {
            column.setIdentifier(removeDialect(column.getIdentifier()));
        }

        if (CollUtil.isNotEmpty(column.getSourceColumns())) {
            column.getSourceColumns().forEach(this::removeDialect);
        }

        return column;
    }

    /**
     * 移除方言
     */
    private Table removeDialect(Table table) {
        if (Objects.isNull(table)) {
            return null;
        }

        if (Objects.nonNull(table.getDbName())) {
            table.setDbName(removeDialect(table.getDbName()));
        }

        if (Objects.nonNull(table.getName())) {
            table.setName(removeDialect(table.getName()));
        }

        if (Objects.nonNull(table.getAlias())) {
            table.setAlias(removeDialect(table.getAlias()));
        }

        return table;
    }

    /**
     * 移除方言
     */
    private String removeDialect(String name) {
        return name.replace("`", "");
    }
}
