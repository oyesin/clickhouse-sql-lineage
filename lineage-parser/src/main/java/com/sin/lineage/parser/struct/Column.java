package com.sin.lineage.parser.struct;

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
}
