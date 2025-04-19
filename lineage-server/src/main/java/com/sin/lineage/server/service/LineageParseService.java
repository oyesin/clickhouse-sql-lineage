package com.sin.lineage.server.service;

import com.sin.lineage.parser.ClickHouseLineageParser;
import com.sin.lineage.parser.struct.graph.Node;
import com.sin.lineage.parser.struct.meta.TableMeta;
import com.sin.lineage.server.common.struct.LineageParseReq;
import com.sin.lineage.server.common.vo.graph.LineageGraph;
import com.sin.lineage.server.common.vo.graph.link.ColumnLink;
import com.sin.lineage.server.utils.SqlSplitUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 血缘解析服务类
 *
 * @author yesin
 * @date 2025/4/18
 */
@Service
public class LineageParseService {

    /**
     * 解析create语句
     *
     * @param createSqlList create SQL 列表
     * @return 表元数据
     */
    public List<TableMeta> parseCreateSql(String createSqlList) {
        try {
            return ClickHouseLineageParser.parseDdl(SqlSplitUtil.splitSql(createSqlList));
        } catch (Exception e) {
            throw new IllegalArgumentException("DDL SQL 解析失败");
        }
    }

    /**
     * 解析字段血缘
     *
     * @param req
     * @return
     */
    public LineageGraph parseLineage(LineageParseReq req) {
        List<List<Node>> lineages = ClickHouseLineageParser.parseColumnLineage(req.getSingleSql(), req.getTableMetas());

        LineageGraph result = new LineageGraph();
        for (List<Node> lineage : lineages) {
            Node targetNode = lineage.get(0);
            Node sourceNode = lineage.get(lineage.size() - 1);
            ColumnLink columnLink = new ColumnLink(sourceNode.getTableName(), sourceNode.getColumnName(),
                    targetNode.getTableName(), targetNode.getColumnName());
            result.addLink(columnLink);

            result.getVertexByName(targetNode.getTableName()).addColumn(targetNode.getColumnName());
            result.getVertexByName(sourceNode.getTableName()).addColumn(sourceNode.getColumnName());
        }

        // 添加传入的表元数据
        req.getTableMetas().forEach(tableMeta -> {
            result.getVertexByName(tableMeta.getName()).addColumns(tableMeta.getColumns());
        });

        return result;
    }
}
