package com.sin.lineage.parser.clickhouse;

import com.google.common.collect.Lists;
import com.sin.lineage.parser.ClickHouseLineageParser;
import com.sin.lineage.parser.struct.graph.Node;
import com.sin.lineage.parser.struct.meta.TableMeta;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 基础的血缘测试类
 *
 * @author yesin
 * @date 2025/3/19
 */
public class BaseLineageTest {

    protected String sql;

    protected String[] expected;

    protected List<List<Node>> lineages;

    protected boolean isLog = true;

    @AfterEach
    void afterEach() {
        if (lineages == null) {
            return;
        }

        if (isLog) {
            System.out.println("未过滤中间表的血缘: ");
            lineages.forEach(v -> {
                List<Node> reverseList = Lists.newArrayList(v);
                Collections.reverse(reverseList);
                System.out.println(reverseList.stream().map(Node::toString).collect(Collectors.joining("->")));
            });
        }

        List<String> list = lineages.stream()
                .map(v -> v.get(v.size() - 1) + "->" + v.get(0).toString())
                .collect(Collectors.toList());

        String actualLineage = getActualLineage(list);
        Assertions.assertEquals(expected.length, list.size());
        Arrays.stream(expected).forEach(e -> Assertions.assertEquals(e, list.contains(e) ? e : actualLineage));
    }

    private String getActualLineage(List<String> lineages) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lineages.size(); i++) {
            result.append(lineages.get(i));
            if (i < lineages.size() - 1) {
                result.append("\n");
            }

        }
        return result.toString();
    }


    protected TableMeta getTableMetaOfUser() {
        String createSql = """
                CREATE TABLE t_user (
                    id Int64,
                    name String,
                    age Int32,
                    deptId Int64
                ) ENGINE = MergeTree()
                ORDER BY id
                """;

        try {
            return ClickHouseLineageParser.parseDdl(Lists.newArrayList(createSql)).get(0);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    protected TableMeta getTableMetaOfDept() {
        String createSql = """
                CREATE TABLE t_dept (
                    id Int64,
                    name String
                ) ENGINE = MergeTree()
                ORDER BY id
                """;

        try {
            return ClickHouseLineageParser.parseDdl(Lists.newArrayList(createSql)).get(0);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    protected TableMeta getTableMetaOfOrders() {
        String createSql = """
                CREATE TABLE orders (
                    id Int64,
                    name String,
                    order_status Int32,
                    order_date DateTime
                ) ENGINE = MergeTree()
                ORDER BY id
                """;

        try {
            return ClickHouseLineageParser.parseDdl(Lists.newArrayList(createSql)).get(0);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    protected TableMeta getTableMetaOfLogRecord() {
        String createSql = """
                -- uk.log_records definition
                CREATE TABLE uk.log_records (
                    `log_id` UUID DEFAULT generateUUIDv4() COMMENT '日志唯一ID',
                    `log_time` DateTime64(3, 'Asia/Shanghai') COMMENT '日志时间(精确到毫秒)',
                    `level` Enum8(
                        'DEBUG' = 0,
                        'INFO' = 1,
                        'WARN' = 2,
                        'ERROR' = 3,
                        'FATAL' = 4
                    ) COMMENT '日志级别',
                    `service` LowCardinality(STRING) COMMENT '服务名称',
                    `host` IPv4 COMMENT '主机IP',
                    `logger` LowCardinality(STRING) COMMENT '日志记录器名称',
                    `message` STRING COMMENT '原始日志内容',
                    `trace_id` STRING COMMENT '链路追踪ID',
                    `thread` STRING COMMENT '线程名称',
                    `exception` Nullable(STRING) COMMENT '异常堆栈',
                    `cost_time` Nullable(Float32) COMMENT '耗时(毫秒)',
                    `http_code` Nullable(UInt16) COMMENT 'HTTP状态码',
                    `http_method` LowCardinality(Nullable(STRING)) COMMENT 'HTTP方法',
                    `path` Nullable(STRING) COMMENT '请求路径',
                    `params` STRING COMMENT '扩展参数(JSON格式)'
                ) ENGINE = MergeTree PARTITION BY toYYYYMM(log_time)
                ORDER BY (log_time, LEVEL, host)
                SETTINGS index_granularity = 8192
                COMMENT '通用日志记录表';
                """;

        try {
            return ClickHouseLineageParser.parseDdl(Lists.newArrayList(createSql)).get(0);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
