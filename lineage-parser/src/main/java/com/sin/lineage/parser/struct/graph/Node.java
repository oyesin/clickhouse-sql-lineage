package com.sin.lineage.parser.struct.graph;

import lombok.Data;

/**
 * 节点
 *
 * @author yesin
 * @date 2025/3/18
 */
@Data
public class Node {

    private String tableName;

    private String columnName;

    public Node(String tableName, String columnName) {
        this.tableName = tableName;
        this.columnName = columnName;
    }

    @Override
    public String toString() {
        return tableName + "." + columnName;
    }
}
