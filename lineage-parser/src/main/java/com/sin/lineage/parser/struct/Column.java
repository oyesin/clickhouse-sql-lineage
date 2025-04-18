package com.sin.lineage.parser.struct;

import cn.hutool.core.collection.CollUtil;
import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

/**
 * 列
 *
 * @author yesin
 * @date 2025/3/17
 */
@Data
public class Column {

    private Boolean isSubquery = false;

    /**
     * 标识符
     */
    private String identifier;

    /**
     * 列名
     */
    private String name;

    /**
     * 来源列
     */
    private List<Column> sourceColumns;

    public Column(String name) {
        this.name = name;
    }

    public Column(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public void addSourceColumn(Column column) {
        if (column == null) {
            return;
        }

        if (sourceColumns == null) {
            sourceColumns = Lists.newArrayList();
        }

        sourceColumns.add(column);
    }

    public void addSourceColumns(List<Column> columns) {
        if (CollUtil.isEmpty(columns)) {
            return;
        }

        if (sourceColumns == null) {
            sourceColumns = Lists.newArrayList();
        }

        sourceColumns.addAll(columns);
    }
}
