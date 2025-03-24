package com.sin.lineage.parser.listener;

import com.sin.lineage.antlr.clickhouse.ClickHouseParser;
import com.sin.lineage.antlr.clickhouse.ClickHouseParserBaseListener;
import com.sin.lineage.parser.struct.meta.TableMeta;
import lombok.Getter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * ClickHouse DDL 语句解析监听器
 *
 * @author yesin
 * @date 2025/3/23
 */
@Getter
public class ClickHouseDdlParserListener extends ClickHouseParserBaseListener {

    private TableMeta tableMeta;

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterCreateTableStmt(ClickHouseParser.CreateTableStmtContext ctx) {
        tableMeta = new TableMeta();
        // 解析表名
        String tableName = ctx.tableIdentifier().identifier().getText();
        tableMeta.setName(tableName);

        // 解析列定义
        if (ctx.tableSchemaClause() instanceof ClickHouseParser.SchemaDescriptionClauseContext) {
            ClickHouseParser.SchemaDescriptionClauseContext instanceCtx = (ClickHouseParser.SchemaDescriptionClauseContext) ctx.tableSchemaClause();
            List<String> columns = instanceCtx.tableElementExpr().stream()
                    .map(this::parTableElementExpr)
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            tableMeta.setColumns(columns);
        }
    }


    /**
     * 只需要解析TableElementExprColumn
     * <pre>
     * tableElementExpr
     *     : tableColumnDfnt                            # TableElementExprColumn
     *     | CONSTRAINT identifier CHECK columnExpr     # TableElementExprConstraint
     *     | INDEX tableIndexDfnt                       # TableElementExprIndex
     *     | PROJECTION tableProjectionDfnt             # TableElementExprProjection
     * </pre>
     */
    private String parTableElementExpr(ClickHouseParser.TableElementExprContext ctx) {
        if (ctx instanceof ClickHouseParser.TableElementExprColumnContext) {
            ClickHouseParser.TableColumnDfntContext tableColumnDfntContext = ((ClickHouseParser.TableElementExprColumnContext) ctx).tableColumnDfnt();
            return tableColumnDfntContext.nestedIdentifier().getText();
        }

        return null;
    }
}
