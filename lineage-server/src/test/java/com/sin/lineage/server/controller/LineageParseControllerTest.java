package com.sin.lineage.server.controller;

import com.sin.lineage.parser.struct.meta.TableMeta;
import com.sin.lineage.server.common.struct.LineageParseReq;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LineageParseControllerTest {
    @Resource
    private LineageParseController lineageParseController;

    @Test
    void parseCreateSql() {
        String createSqlList = """
                -- 产品效益统计表
                CREATE TABLE IF NOT EXISTS product_profit_stats
                (
                    product_id       UInt32,
                    total_revenue   Decimal(18, 2),
                    total_cost      Decimal(18, 2),
                    total_profit    Decimal(18, 2) MATERIALIZED total_revenue - total_cost,
                    stat_date       Date DEFAULT today()
                )
                ENGINE = MergeTree()
                ORDER BY (stat_date, product_id);
                
                CREATE TABLE IF NOT EXISTS sales
                (
                    order_id      UInt64,          -- 订单ID
                    product_id    UInt32,          -- 产品ID
                    revenue       Decimal(18, 2),  -- 收入
                    cost          Decimal(18, 2),  -- 成本
                    sale_time     DateTime,        -- 销售时间
                    quantity      UInt32,          -- 销售数量
                    unit_price    Decimal(18, 2),  -- 单价（可选）
                    region        String           -- 销售地区（可选字段）
                )
                ENGINE = MergeTree()
                PARTITION BY toYYYYMM(sale_time)   -- 按月分区
                ORDER BY (sale_time, product_id);  -- 按时间和产品排序
                """;
        lineageParseController.parseCreateSql(createSqlList);
    }

    @Test
    void parseLineage() {
        String singleSql = """
                INSERT INTO product_profit_stats (product_id, total_revenue, total_cost)
                SELECT
                    product_id,
                    sum(revenue) AS total_revenue,
                    sum(cost) AS total_cost
                FROM sales
                WHERE toDate(sale_time) = today() -- 按需添加时间过滤
                GROUP BY product_id;
                """;
        LineageParseReq req = new LineageParseReq();
        req.setSingleSql(singleSql);
        req.setTableMetas(getTableMeta());

        lineageParseController.parseLineage(req);
    }

    private List<TableMeta> getTableMeta() {
        String createSqlList = """
                -- 产品效益统计表
                CREATE TABLE IF NOT EXISTS product_profit_stats
                (
                    product_id       UInt32,
                    total_revenue   Decimal(18, 2),
                    total_cost      Decimal(18, 2),
                    total_profit    Decimal(18, 2) MATERIALIZED total_revenue - total_cost,
                    stat_date       Date DEFAULT today()
                )
                ENGINE = MergeTree()
                ORDER BY (stat_date, product_id);
                
                CREATE TABLE IF NOT EXISTS sales
                (
                    order_id      UInt64,          -- 订单ID
                    product_id    UInt32,          -- 产品ID
                    revenue       Decimal(18, 2),  -- 收入
                    cost          Decimal(18, 2),  -- 成本
                    sale_time     DateTime,        -- 销售时间
                    quantity      UInt32,          -- 销售数量
                    unit_price    Decimal(18, 2),  -- 单价（可选）
                    region        String           -- 销售地区（可选字段）
                )
                ENGINE = MergeTree()
                PARTITION BY toYYYYMM(sale_time)   -- 按月分区
                ORDER BY (sale_time, product_id);  -- 按时间和产品排序
                """;
        return lineageParseController.parseCreateSql(createSqlList).getData();
    }
}