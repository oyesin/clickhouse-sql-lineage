package com.sin.lineage.parser.listener;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.sin.lineage.antlr.clickhouse.ClickHouseParser;
import com.sin.lineage.antlr.clickhouse.ClickHouseParserBaseListener;
import com.sin.lineage.parser.enums.TableType;
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

    /**
     * 存储insert语句与其select语句的上下文映射关系
     */
    private Pair<ClickHouseParser.InsertStmtContext, ClickHouseParser.SelectUnionStmtContext> insertStmtMap;

    private Map<RuleContext, Statement> stmtMap = Maps.newHashMap();

    /**
     * 存储表名和表拥有的列的映射关系
     */
    private Map<String, List<String>> tableMap = Maps.newHashMap();

    /**
     * 存储血缘的目标表名
     */
    private String sinkTableName;

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
        if (ctx.dataClause() instanceof ClickHouseParser.DataClauseSelectContext) {
            ClickHouseParser.DataClauseSelectContext selectCtx = (ClickHouseParser.DataClauseSelectContext) ctx.dataClause();
            statement.addSourceTable(new Table(generateStmtName(), TableType.TMP_TABLE));
            insertStmtMap = Pair.of(ctx, selectCtx.selectUnionStmt());
            stmtMap.put(ctx, statement);
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
            if (sinkTableName == null) {
                sinkTableName = statement.getSinkTable().getName();
            }
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
    public void exitSelectUnionStmt(ClickHouseParser.SelectUnionStmtContext ctx) {
        Statement statement = getStatementOfTopContext(ctx);

        // 解析列血缘
        statement.getColumns().forEach(column -> {
            statement.getSourceTable().forEach(sourceTable -> {
                // 获取来源表拥有的列
                List<String> columns = tableMap.getOrDefault(sourceTable.getName(), Lists.newArrayList());
                if (columns.contains(column.getName())) {
                    Node sourceNode = new Node(statement.getSinkTable().getName(), column.getName());
                    Node targetNode = new Node(sourceTable.getName(), column.getName());
                    Graphs.addEdgeWithVertices(g, sourceNode, targetNode);
                }
            });
        });
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

        if (joinExprCtx instanceof ClickHouseParser.JoinExprTableContext) {
            statement.addSourceTable(parseTableExpr(((ClickHouseParser.JoinExprTableContext) joinExprCtx).tableExpr()));
        }
    }

    private Statement getStatementOfTopContext(RuleContext ctx) {
        RuleContext parent = ctx;
        while (parent != null) {
            if (parent instanceof ClickHouseParser.SelectUnionStmtContext) {
                return stmtMap.computeIfAbsent(parent, v -> new Statement(StatementType.SELECT));
            }

            parent = parent.getParent();
        }

        throw new IllegalArgumentException("获取Statement失败");
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
            ClickHouseParser.TableExprIdentifierContext context = (ClickHouseParser.TableExprIdentifierContext) ctx;
            return parseTableIdentifier(context.tableIdentifier());
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
