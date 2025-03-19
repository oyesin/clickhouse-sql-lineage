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

        TableMeta tableMeta = new TableMeta();
        tableMeta.setName("t_user");
        tableMeta.setColumns(Lists.newArrayList("id", "name", "age"));

        lineages = ClickHouseLineageParser.parseColumnLineage(sql, Lists.newArrayList(tableMeta));

        expected = new String[]{
                "stmt0.id->t_user.id"
        };
    }
}
