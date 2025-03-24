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
public class ClickHouseInsertTest extends BaseLineageTest {


    @BeforeEach
    void before() {
        isLog = true;
    }

    @Test
    void test() throws Exception {
        sql = "insert into t_sink(c1, c2) select id, name from t_user";

        TableMeta user = new TableMeta();
        user.setName("t_user");
        user.setColumns(Lists.newArrayList("id", "name", "age"));

        TableMeta sink = new TableMeta();
        sink.setName("t_sink");
        sink.setColumns(Lists.newArrayList("c1", "c2"));

        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(user));

        expected = new String[]{
                "t_user.id->t_sink.c1",
                "t_user.name->t_sink.c2",
        };
    }
}
