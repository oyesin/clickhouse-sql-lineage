package com.sin.lineage.server.common.struct;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateSqlReq {
    /**
     * 要解析字段血缘的单条sql
     */
    @NotBlank(message = "解析的sql不能为空")
    private String createSqlList;
}
