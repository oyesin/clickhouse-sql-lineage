package com.sin.lineage.server.controller;

import com.sin.lineage.parser.struct.meta.TableMeta;
import com.sin.lineage.server.common.struct.LineageParseReq;
import com.sin.lineage.server.common.struct.Result;
import com.sin.lineage.server.common.vo.graph.LineageGraph;
import com.sin.lineage.server.service.LineageParseService;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lineage/parse")
public class LineageParseController {

    @Resource
    private LineageParseService lineageParseService;

    @PostMapping("/create")
    public Result<List<TableMeta>> parseCreateSql(@Validated @RequestBody String createSqlList) {
        return Result.success(lineageParseService.parseCreateSql(createSqlList));
    }

    @PostMapping("/field")
    public Result<LineageGraph> parseLineage(@Validated @RequestBody LineageParseReq req) {
        return Result.success(lineageParseService.parseLineage(req));
    }
}
