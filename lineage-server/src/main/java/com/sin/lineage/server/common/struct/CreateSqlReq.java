package com.sin.lineage.server.common.struct;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateSqlReq {

    /**
     * create sql语句，多个sql用;分隔
     */
    @NotBlank
    private String createSqlList;
}
