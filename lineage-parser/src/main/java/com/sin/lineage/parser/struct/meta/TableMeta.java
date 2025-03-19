package com.sin.lineage.parser.struct.meta;

import lombok.Data;

import java.util.List;

/**
 * 表元数据
 *
 * @author yesin
 * @date 2025/3/18
 */
@Data
public class TableMeta {

    /**
     * 表名
     */
    private String name;

    /**
     * 表拥有的列
     */
    private List<String> columns;
}
