package com.sin.lineage.parser.struct;

import lombok.Data;

/**
 * 表
 *
 * @author yesin
 * @date 2025/3/17
 */
@Data
public class Table {

    private String dbName;

    private String name;

    private String alias;

    public Table(String name) {
        this.name = name;
    }

    public String fullName() {
        return alias == null ? name : name + "_" + alias;
    }

    public Table copy() {
        Table result = new Table(name);
        result.dbName = dbName;
        result.name = name;
        result.alias = alias;
        return result;
    }
}
