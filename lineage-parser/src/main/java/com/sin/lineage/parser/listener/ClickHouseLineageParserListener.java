package com.sin.lineage.parser.listener;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.sin.lineage.antlr.clickhouse.ClickHouseParser;
import com.sin.lineage.antlr.clickhouse.ClickHouseParserBaseListener;
import com.sin.lineage.parser.enums.TableType;
import com.sin.lineage.parser.exception.LineageException;
import com.sin.lineage.parser.struct.Column;
import com.sin.lineage.parser.struct.Statement;
import com.sin.lineage.parser.struct.StatementType;
import com.sin.lineage.parser.struct.Table;
import com.sin.lineage.parser.struct.graph.Node;
import com.sin.lineage.parser.struct.meta.TableMeta;
import org.antlr.v4.runtime.RuleContext;
import org.jgrapht.Graphs;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;

import java.util.List;
import java.util.Map;
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
     */
    protected final SimpleDirectedGraph<Node, DefaultEdge> g;

    private Integer stmtIndex = 0;

    private final Map<RuleContext, Statement> stmtMap = Maps.newHashMap();

    /**
     * 存储表名和表拥有的列的映射关系
     */
    private final Map<String, List<String>> tableMap = Maps.newHashMap();

    /**
     * 存储血缘的目标表名，默认为stmt0，如果有insert，则是插入表的名称
     */
    private String sinkTableName = "stmt0";

    public ClickHouseLineageParserListener(List<TableMeta> tableMetas) {
        g = new SimpleDirectedGraph<>(DefaultEdge.class);
        tableMetas.forEach(tableMeta -> tableMap.put(tableMeta.getName(), tableMeta.getColumns()));
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
        Statement statement = new Statement(StatementType.INSERT);

        // 解析insert表
        Table table = parseTableIdentifier(ctx.tableIdentifier());
        table.setType(TableType.REAL_TABLE);
        statement.setSinkTable(table);
        sinkTableName = table.getName();

        // 解析insert的列
        statement.addColumns(parseColumnsClause(ctx.columnsClause()));

        // 添加source表
        if (ctx.dataClause() instanceof ClickHouseParser.DataClauseSelectContext instanceCtx) {
            Table sourceTable = new Table(generateStmtName(), TableType.TMP_TABLE);
            Statement srcStatement = new Statement(StatementType.SELECT);
            srcStatement.setSinkTable(sourceTable);

            statement.addSourceTable(sourceTable);
            stmtMap.put(ctx, statement);
            stmtMap.put(instanceCtx.topSelectStmt(), srcStatement);
        }
    }

    /**
     * CTE语句
     */
    @Override
    public void enterCteStmt(ClickHouseParser.CteStmtContext ctx) {
        getStatementOfTopContext(ctx.topSelectStmt()).setSinkTable(new Table(generateStmtName(), TableType.TMP_TABLE));
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
        List<String> srcColumns = tableMap.get(sourceTable.getName());

        // insert into没有定义列的情况
        List<Column> stmtColumns = statement.getColumns();
        if (stmtColumns.isEmpty()) {
            List<String> sinkColumns = tableMap.get(statement.getSinkTable().getName());
            List<Column> insertColumns = sinkColumns.subList(0, srcColumns.size()).stream().map(v -> {
                Column column = new Column(v);
                column.setIdentifier(sourceTable.getName());
                return column;
            }).collect(Collectors.toList());
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
            statement.setSinkTable(new Table(generateStmtName(), TableType.TMP_TABLE));
        }

        // 解析列
        ctx.columnExprList().columnsExpr().stream()
                .flatMap(v -> parseColumnsExpr(v).stream())
                .forEach(statement::addColumn);
    }

    /**
     * 在退出语句时解析列血缘
     */
    @Override
    public void exitSelectStmt(ClickHouseParser.SelectStmtContext ctx) {
        Statement statement = getStatementOfTopContext(ctx);

        List<Column> expandColumns = Lists.newArrayList();
        statement.getColumns().forEach(col -> {
            // 拓展*列为具体的列
            if ("*".equals(col.getName())) {
                if (col.getIdentifier() != null) {
                    Table srcTable = statement.getSourceTable().stream()
                            .filter(v -> v.getAlias() == null ? v.getName().equals(col.getIdentifier())
                                    : v.getAlias().equals(col.getIdentifier()))
                            .findFirst()
                            .orElseThrow(() -> new LineageException(String.format("找不到列标识符 %s 对应的表", col.getIdentifier())));
                    tableMap.get(srcTable.getName()).stream()
                            .map(v -> new Column(col.getIdentifier(), v))
                            .forEach(expandColumns::add);
                } else {
                    statement.getSourceTable()
                            .forEach(srcTable -> tableMap.get(srcTable.getName()).stream()
                                    .map(srcCol -> new Column(srcTable.getName(), srcCol))
                                    .forEach(expandColumns::add));
                }
            } else {
                expandColumns.add(col);
            }
        });
        statement.setColumns(expandColumns);

        // 添加sink表拥有的列
        if (!tableMap.containsKey(statement.getSinkTable().getName())) {
            List<String> columns = expandColumns.stream()
                    .map(Column::getName)
                    .collect(Collectors.toList());
            tableMap.put(statement.getSinkTable().getName(), columns);
        }

        // 解析列血缘
        parseColumnLineage(statement);
    }

    private void parseColumnLineage(Statement statement) {
        statement.getColumns().forEach(column -> statement.getSourceTable().forEach(sourceTable -> {
            // 获取来源表拥有的列
            List<String> columns = tableMap.getOrDefault(sourceTable.getName(), Lists.newArrayList());
            if (columns.contains(column.getName())) {
                Node sourceNode = new Node(statement.getSinkTable().getName(), column.getName());
                Node targetNode = new Node(sourceTable.getName(), column.getName());
                Graphs.addEdgeWithVertices(g, sourceNode, targetNode);
            }
        }));
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
        if (ctx instanceof ClickHouseParser.JoinExprOpContext) {
            ClickHouseParser.JoinExprOpContext instanceCtx = (ClickHouseParser.JoinExprOpContext) ctx;
            return instanceCtx.joinExpr().stream()
                    .flatMap(v -> parseJoinExpr(v).stream())
                    .collect(Collectors.toList());
        }

        if (ctx instanceof ClickHouseParser.JoinExprCrossOpContext) {
            ClickHouseParser.JoinExprCrossOpContext instanceCtx = (ClickHouseParser.JoinExprCrossOpContext) ctx;
            return instanceCtx.joinExpr().stream()
                    .flatMap(v -> parseJoinExpr(v).stream())
                    .collect(Collectors.toList());
        }

        if (ctx instanceof ClickHouseParser.JoinExprTableContext) {
            ClickHouseParser.JoinExprTableContext instanceCtx = (ClickHouseParser.JoinExprTableContext) ctx;
            Table table = parseTableExpr(instanceCtx.tableExpr());
            if (table == null) {
                return Lists.newArrayList();
            }

            return Lists.newArrayList(table);
        }

        if (ctx instanceof ClickHouseParser.JoinExprParensContext) {
            ClickHouseParser.JoinExprParensContext instanceCtx = (ClickHouseParser.JoinExprParensContext) ctx;
            return parseJoinExpr(instanceCtx.joinExpr());
        }

        return Lists.newArrayList();
    }

    private Statement getStatementOfTopContext(RuleContext ctx) {
        RuleContext parent = ctx;
        while (parent != null) {
            if (parent instanceof ClickHouseParser.TopSelectStmtContext) {
                // 判断是否是cte语句
                ClickHouseParser.NamedQueryContext namedQueryContext = getNamedQueryCtxOfCte(parent);
                if (namedQueryContext != null) {
                    Statement result = stmtMap.computeIfAbsent(parent, v -> new Statement(StatementType.SELECT));
                    result.setSinkTable(new Table(namedQueryContext.name.getText(), TableType.TMP_TABLE));
                    return result;
                }

                return stmtMap.computeIfAbsent(parent, v -> new Statement(StatementType.SELECT));
            }

            parent = parent.getParent();
        }

        throw new IllegalArgumentException("获取Statement失败");
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
                .map(v -> new Column(v.getText()))
                .collect(Collectors.toList());
    }

    /**
     * <pre>
     * columnsExpr
     *     : (tableIdentifier DOT)? ASTERISK  # ColumnsExprAsterisk
     *     | LPAREN selectUnionStmt RPAREN    # ColumnsExprSubquery
     *     // NOTE: asterisk and subquery goes before |columnExpr| so that we can mark them as multi-column expressions.
     *     | columnExpr                       # ColumnsExprColumn
     *     ;
     * </pre>
     */
    private List<Column> parseColumnsExpr(ClickHouseParser.ColumnsExprContext ctx) {
        if (ctx instanceof ClickHouseParser.ColumnsExprAsteriskContext) {
            ClickHouseParser.ColumnsExprAsteriskContext instanceCtx = (ClickHouseParser.ColumnsExprAsteriskContext) ctx;
            Column column = new Column("*");
            if (instanceCtx.tableIdentifier() != null) {
                Table table = parseTableIdentifier(instanceCtx.tableIdentifier());
                column.setIdentifier(table.getName());
            }

            return Lists.newArrayList(column);
        }

        if (ctx instanceof ClickHouseParser.ColumnsExprColumnContext) {
            return parseColumnExpr(((ClickHouseParser.ColumnsExprColumnContext) ctx).columnExpr());
        }
        return Lists.newArrayList();
    }

    private List<Column> parseColumnExpr(ClickHouseParser.ColumnExprContext ctx) {
        if (ctx instanceof ClickHouseParser.ColumnExprIdentifierContext) {
            ClickHouseParser.ColumnExprIdentifierContext implCtx = (ClickHouseParser.ColumnExprIdentifierContext) ctx;
            String name = implCtx.columnIdentifier().nestedIdentifier().getText();
            return Lists.newArrayList(new Column(name));
        }

        throw new IllegalArgumentException("TODO");
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
        if (ctx instanceof ClickHouseParser.TableExprIdentifierContext) {
            ClickHouseParser.TableExprIdentifierContext instanceCtx = (ClickHouseParser.TableExprIdentifierContext) ctx;
            return parseTableIdentifier(instanceCtx.tableIdentifier());
        }

        // 未解析 TableExprFunction

        if (ctx instanceof ClickHouseParser.TableExprSubqueryContext) {
            ClickHouseParser.TableExprSubqueryContext instanceCtx = (ClickHouseParser.TableExprSubqueryContext) ctx;
            Statement statement = new Statement(StatementType.SELECT);
            String tableName;
            if (instanceCtx.getParent() != null && instanceCtx.getParent() instanceof ClickHouseParser.TableExprAliasContext) {
                ClickHouseParser.TableExprAliasContext parent = (ClickHouseParser.TableExprAliasContext) instanceCtx.getParent();
                tableName = parent.alias() == null ? parent.identifier().getText() : parent.alias().getText();
            } else {
                tableName = generateStmtName();
            }
            Table result = new Table(tableName, TableType.TMP_TABLE);
            statement.setSinkTable(result);
            stmtMap.put(instanceCtx.selectUnionStmt(), statement);
            return result;
        }

        if (ctx instanceof ClickHouseParser.TableExprAliasContext) {
            ClickHouseParser.TableExprAliasContext instanceCtx = (ClickHouseParser.TableExprAliasContext) ctx;
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

        return result;
    }

    private String generateStmtName() {
        return "stmt" + stmtIndex++;
    }
}
