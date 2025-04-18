package com.sin.lineage.parser.clickhouse;

import com.google.common.collect.Lists;
import com.sin.lineage.parser.ClickHouseLineageParser;
import org.junit.jupiter.api.Test;

/**
 * 解析列
 *
 * @author huangzhengxian
 * @date 2025/4/12
 */
public class ClickHouseColumnParseTest extends BaseLineageTest {

    @Test
    void testSubQueryColumn() {
        sql = "select (select max(id) from t_user)";

        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(getTableMetaOfUser()));

        expected = new String[]{
                "t_user.id->stmt0._subquery_1"
        };
    }

    @Test
    void testSubQueryColumnWithAlias() {
        sql = "select (select max(id) from t_user) maxId";

        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(getTableMetaOfUser()));

        expected = new String[]{
                "t_user.id->stmt0.maxId"
        };
    }

    @Test
    void testSubQueryColumnWithAliasAndTable() {
        sql = "select (select max(id) from t_user) * age as maxId from t_user";
        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(getTableMetaOfUser()));
        expected = new String[]{
                "t_user.id->stmt0.maxId",
                "t_user.age->stmt0.maxId"
        };
    }

    @Test
    void testCase() {
        sql = """
                select
                    case
                        when id > 10 and name = 'test' then 'a'
                        else 'b'
                    end as group
                from
                    t_user
                """;

        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(getTableMetaOfUser()));

        expected = new String[]{
                "t_user.id->stmt0.group",
                "t_user.name->stmt0.group"
        };
    }

    @Test
    void testCase2() {
        sql = """
                select
                    case
                        when age > 18 then '成年'
                        when age >= 10 and age <= 18 then '未成年'
                        when age < 18 and name = 'zhangsan' then 'zhangsan未成年'
                        else '其他'
                    end as group
                from
                    t_user
                """;

        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(getTableMetaOfUser()));

        expected = new String[]{
                "t_user.age->stmt0.group",
                "t_user.name->stmt0.group"
        };
    }

    @Test
    void test3() {
        sql = """
                SELECT
                    CASE
                        WHEN order_status = 'Shipped' AND DATE_DIFF(NOW(), order_date) <= 7 THEN 'Recently Shipped'
                        WHEN order_status = 'Shipped' THEN 'Old Shipment'
                        WHEN order_status = 'Pending' THEN 'Pending'
                        ELSE 'Unknown'
                    END AS shipment_status
                FROM
                    orders;
                """;
        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(getTableMetaOfOrders()));

        expected = new String[]{
                "orders.order_status->stmt0.shipment_status",
                "orders.order_date->stmt0.shipment_status"
        };
    }

    @Test
    void testCast() {
        sql = """
                select
                    cast(id as String) as id_str,
                    cast(age, 'String') as age_str
                from
                    t_user
                """;

        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(getTableMetaOfUser()));

        expected = new String[]{
                "t_user.id->stmt0.id_str",
                "t_user.age->stmt0.age_str"
        };
    }

    @Test
    void testExtract() {
        sql = "SELECT EXTRACT(DAY FROM toDateTime(log_time)) as `day` from log_records";

        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(getTableMetaOfLogRecord()));

        expected = new String[] {
                "log_records.log_time->stmt0.day"
        };
    }

    @Test
    void testWindowFunction() {
        sql = "SELECT avg(age) OVER (PARTITION BY deptId) as avg_age from t_user";

        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(getTableMetaOfUser()));

        expected = new String[] {
                "t_user.age->stmt0.avg_age"
        };
    }

    @Test
    void testFunction() {
        sql = """
                select
                   concat(name, '_', age)
                from
                    t_user
                """;

        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(getTableMetaOfUser()));

        expected = new String[]{
                "t_user.name->stmt0.concat(name,'_',age)",
                "t_user.age->stmt0.concat(name,'_',age)",
        };
    }
}

