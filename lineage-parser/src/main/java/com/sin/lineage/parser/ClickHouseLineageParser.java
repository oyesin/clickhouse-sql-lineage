package com.sin.lineage.parser;

import com.google.common.collect.Lists;
import com.sin.lineage.antlr.clickhouse.ClickHouseLexer;
import com.sin.lineage.antlr.clickhouse.ClickHouseParser;
import com.sin.lineage.parser.listener.ClickHouseDdlParserListener;
import com.sin.lineage.parser.listener.ClickHouseLineageParserListener;
import com.sin.lineage.parser.struct.graph.Node;
import com.sin.lineage.parser.struct.meta.TableMeta;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;

import java.util.List;

/**
 * ClickHouse 血缘解析器
 *
 * @author yesin
 * @date 2025/3/13
 */
public class ClickHouseLineageParser {

    /**
     * 解析DDL语句
     *
     * @param createTableSqlList create table sql列表
     * @return 表元数据列表
     */
    public static List<TableMeta> parseDdl(List<String> createTableSqlList) throws Exception {
        return createTableSqlList.stream()
                .map(ClickHouseLineageParser::parseDdl)
                .toList();
    }

    /**
     * 解析列血缘
     *
     * @param singleSql  单条sql
     * @param tableMetas 表元数据
     * @return 列血缘
     */
    public static List<List<Node>> parseColumnLineage(String singleSql, List<TableMeta> tableMetas) {
        Pair<SimpleDirectedGraph<Node, DefaultEdge>, String> pair = parseLineage(singleSql, tableMetas);

        // 获取sink表所有字段的血缘
        return pair.getFirst().vertexSet().stream()
                .filter(v -> v.getTableName().equals(pair.getSecond()))
                .flatMap(v -> findAllPaths(pair.getFirst(), v).stream())
                // 过滤掉来源不是真实表的血缘
                .filter(v -> !v.get(v.size() - 1).getTableName().contains("stmt"))
                .toList();
    }

    /**
     * 解析DDL语句
     *
     * @param singleSql 单条createSql语句
     * @return 表元数据
     */
    private static TableMeta parseDdl(String singleSql) {
        // 创建词法分析器
        ClickHouseLexer lexer = new ClickHouseLexer(CharStreams.fromString(singleSql));

        // 创建语法分析器
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ClickHouseParser parser = new ClickHouseParser(tokens);

        // 自定义的ClickHouse血缘解析监听器
        ClickHouseDdlParserListener listener = new ClickHouseDdlParserListener();

        // 遍历语法分析过程中生成的语法分析树，触发回调
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, parser.queryStmt());

        // 返回图
        return listener.getTableMeta();
    }

    /**
     * 解析血缘
     *
     * @param singleSql 单条sql
     * @return 图
     * @throws Exception 解析异常
     */
    private static Pair<SimpleDirectedGraph<Node, DefaultEdge>, String> parseLineage(String singleSql, List<TableMeta> tableMetas) {
        // 创建词法分析器
        ClickHouseLexer lexer = new ClickHouseLexer(CharStreams.fromString(singleSql));

        // 创建语法分析器
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ClickHouseParser parser = new ClickHouseParser(tokens);

        // 自定义的ClickHouse血缘解析监听器
        ClickHouseLineageParserListener listener = new ClickHouseLineageParserListener(tableMetas);

        // 遍历语法分析过程中生成的语法分析树，触发回调
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, parser.queryStmt());

        // 返回图
        return listener.getParserResult();
    }

    /**
     * 找到从startNode开始的所有路径
     *
     * @param graph     图
     * @param startNode 开始节点
     * @return 从startNode出发的所有路径
     */
    private static List<List<Node>> findAllPaths(Graph<Node, DefaultEdge> graph, Node startNode) {
        List<List<Node>> result = Lists.newArrayList();
        findAllPathsByDfs(graph, startNode, Lists.newArrayList(), result);
        return result;
    }

    private static void findAllPathsByDfs(Graph<Node, DefaultEdge> graph,
                                          Node currentNode,
                                          List<Node> currentPath,
                                          List<List<Node>> allPaths) {
        currentPath.add(currentNode);
        List<Node> successors = Graphs.successorListOf(graph, currentNode);
        if (successors.isEmpty()) {
            // 只要路径长度大于1的路径
            if (currentPath.size() > 1) {
                allPaths.add(currentPath);
            }
            return;
        }

        successors.forEach(successor -> findAllPathsByDfs(graph, successor, Lists.newArrayList(currentPath), allPaths));
    }
}
