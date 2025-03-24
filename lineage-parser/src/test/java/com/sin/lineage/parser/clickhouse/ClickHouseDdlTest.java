package com.sin.lineage.parser.clickhouse;

import com.google.common.collect.Lists;
import com.sin.lineage.parser.ClickHouseLineageParser;
import com.sin.lineage.parser.struct.meta.TableMeta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ClickHouseDdlTest {

    @Test
    public void test1() throws Exception {
        String sql = """
                CREATE TABLE test_table (
                    id UInt32,
                    name STRING,
                    age UInt8
                ) ENGINE = MergeTree()
                ORDER BY id
                """;
        List<TableMeta> tableMetas = ClickHouseLineageParser.parseDdl(Lists.newArrayList(sql));


        TableMeta tableMeta = new TableMeta();
        tableMeta.setName("test_table");
        tableMeta.setColumns(Lists.newArrayList("id", "name", "age"));
        List<TableMeta> expected = Lists.newArrayList(tableMeta);

        Assertions.assertEquals(expected, tableMetas);
    }
}
