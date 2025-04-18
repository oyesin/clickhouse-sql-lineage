package com.sin.lineage.parser.struct;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

/**
 * 语句存储器
 *
 * @author yesin
 * @date 2025/3/17
 */
@Data
public class Statement {

    private Table sinkTable;

    private List<Column> columns = Lists.newArrayList();

    private List<Table> sourceTable = Lists.newArrayList();

    public void addColumns(List<Column> columns) {
        this.columns.addAll(columns);
    }

    public void addSourceTable(Table sourceTable) {
        this.sourceTable.add(sourceTable);
    }

    public void addSourceTables(List<Table> sourceTables) {
        this.sourceTable.addAll(sourceTables);
    }

    public String getStatementName() {
        return sinkTable.getName();
    }

    @Override
    public String toString() {
        return sinkTable.fullName();
    }
}
