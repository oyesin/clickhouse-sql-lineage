package com.sin.lineage.parser.struct;

import com.sin.lineage.parser.enums.TableType;
import lombok.Data;

/**
 * 表
 *
 * @author yesin
 * @date 2025/3/17
 */
@Data
public class Table {

    private TableType type;

    private String dbName;

    private String name;

    public Table(String name) {
        this.name = name;
    }

    public Table(String name, TableType type) {
        this.name = name;
        this.type = type;
    }
}
