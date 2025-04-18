package com.sin.lineage.parser.clickhouse;

import com.google.common.collect.Lists;
import com.sin.lineage.parser.ClickHouseLineageParser;
import com.sin.lineage.parser.struct.meta.TableMeta;
import org.junit.jupiter.api.Test;


/**
 * 简单语句测试
 *
 * @author yesin
 * @date 2025/3/17
 */
public class ClickHouseSimpleTest extends BaseLineageTest {

    @Test
    void test() throws Exception {
        sql = "select id from t_user";

        TableMeta tableMeta = getTableMetaOfUser();

        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(tableMeta));

        expected = new String[]{
                "t_user.id->stmt0.id"
        };
    }

    @Test
    void testTableAlias() throws Exception {
        sql = "SELECT t.* FROM t_user t";

        TableMeta tableMeta = getTableMetaOfUser();

        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(tableMeta));

        expected = new String[]{
                "t_user.id->stmt0.id",
                "t_user.name->stmt0.name",
                "t_user.age->stmt0.age",
                "t_user.deptId->stmt0.deptId"
        };
    }

    @Test
    void testSameAlias() throws Exception {
        sql = """
                select
                    *
                from
                    (
                        select
                            *
                        from
                            t_user a
                    ) a
                """;

        TableMeta tableMeta = getTableMetaOfUser();

        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(tableMeta));

        expected = new String[]{
                "t_user.id->stmt0.id",
                "t_user.name->stmt0.name",
                "t_user.age->stmt0.age",
                "t_user.deptId->stmt0.deptId"
        };
    }

    @Test
    void testMultiSubQuery() throws Exception {
        sql = """
                select
                    *
                from
                    (
                        select
                            *
                        from
                            (
                                select
                                    *
                                from
                                    t_user
                            ) b
                    ) a
                """;

        TableMeta tableMeta = getTableMetaOfUser();

        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(tableMeta));

        expected = new String[]{
                "t_user.id->stmt0.id",
                "t_user.name->stmt0.name",
                "t_user.age->stmt0.age",
                "t_user.deptId->stmt0.deptId"
        };
    }

    @Test
    void testWith() throws Exception {
        sql = """
                with t1 as (
                    select
                        id
                    from
                        t_user
                )
                select
                    *
                from
                    t1
                """;

        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(getTableMetaOfUser()));

        expected = new String[]{
                "t_user.id->stmt0.id"
        };
    }

    @Test
    void testNestingWith() throws Exception {
        sql = """
                WITH t1 AS (
                    WITH t2 AS (
                        SELECT
                            name
                        FROM
                            t_user
                    )
                    SELECT
                        *
                    FROM
                        t2
                )
                SELECT
                    *
                FROM
                    t1
                """;
        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(getTableMetaOfUser()));

        expected = new String[]{
                "t_user.name->stmt0.name",
        };
    }

    @Test
    void testNestingWith2() throws Exception {
        sql = """
                WITH t1 AS (
                    WITH t1 AS (
                        SELECT
                            name
                        FROM
                            t_user
                    )
                    SELECT
                        *
                    FROM
                        t1
                )
                SELECT
                    *
                FROM
                    t1
                """;
        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(getTableMetaOfUser()));

        expected = new String[]{
                "t_user.name->stmt0.name",
        };
    }

    @Test
    void testNestingWith3() throws Exception {
        sql = """
                WITH t1 AS (
                    WITH t2 AS (
                        SELECT
                            id,
                            name,
                            deptId
                        FROM
                            t_user
                    ),
                    t3 AS (
                        SELECT
                            t22.id AS userId,
                            t22.name AS userName,
                            t1.id AS deptId,
                            t1.name AS deptName
                        FROM
                            t2 AS t22
                            LEFT JOIN (
                                SELECT
                                    id,
                                    name
                                FROM
                                    t_dept
                            ) t1
                            ON t2.deptId = t1.id
                    )
                    SELECT
                        *
                    FROM
                        t3
                )
                SELECT
                    *
                FROM
                    t1
                """;
        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(getTableMetaOfUser(), getTableMetaOfDept()));

        expected = new String[]{
                "t_user.id->stmt0.userId",
                "t_user.name->stmt0.userName",
                "t_dept.id->stmt0.deptId",
                "t_dept.name->stmt0.deptName",
        };
    }

    @Test
    void testUnionAll() {
        sql = """
                select id, u.name as aliasName from t_user u
                union all
                select id as deptId, name from t_dept
                """;

        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(getTableMetaOfUser(), getTableMetaOfDept()));

        expected = new String[]{
                "t_user.id->stmt0.id",
                "t_user.name->stmt0.aliasName",
                "t_dept.id->stmt0.id",
                "t_dept.name->stmt0.aliasName",
        };
    }

    @Test
    void testUnionAll2() {
        sql = """
                select id, u.name as aliasName from t_user u
                union all
                select id as deptId, (select name from orders where id = 1) as orderName from t_dept
                """;

        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(getTableMetaOfUser(), getTableMetaOfDept(), getTableMetaOfOrders()));

        expected = new String[]{
                "t_user.id->stmt0.id",
                "t_user.name->stmt0.aliasName",
                "t_dept.id->stmt0.id",
                "orders.name->stmt0.aliasName",
        };
    }
}
