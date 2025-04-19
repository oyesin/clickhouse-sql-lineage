package com.sin.lineage.server.common.struct;

import com.sin.lineage.parser.struct.meta.TableMeta;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

/**
 * 血缘解析请求
 *
 * @author yesin
 * @date 2025/4/18
 */
@Data
public class LineageParseReq {

    /**
     * 要解析字段血缘的单条sql
     */
    @NotBlank(message = "解析的sql不能为空")
    private String singleSql;

    /**
     * 表元数据
     */
    private List<TableMeta> tableMetas;
}
