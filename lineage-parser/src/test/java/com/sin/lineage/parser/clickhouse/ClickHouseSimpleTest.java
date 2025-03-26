package com.sin.lineage.parser.clickhouse;

import com.google.common.collect.Lists;
import com.sin.lineage.parser.ClickHouseLineageParser;
import com.sin.lineage.parser.struct.meta.TableMeta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * 简单语句测试
 *
 * @author yesin
 * @date 2025/3/17
 */
public class ClickHouseSimpleTest extends BaseLineageTest {


    @BeforeEach
    void before() {
        isLog = true;
    }

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
                "t_user.age->stmt0.age"
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
                "t_user.age->stmt0.age"
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
                "t_user.age->stmt0.age"
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

    private TableMeta getTableMetaOfUser() throws Exception {
        String createSql = """
                CREATE TABLE t_user (
                    id Int64,
                    name String,
                    age Int32
                ) ENGINE = MergeTree()
                ORDER BY id
                """;
        return ClickHouseLineageParser.parseDdl(Lists.newArrayList(createSql)).get(0);
    }
}
