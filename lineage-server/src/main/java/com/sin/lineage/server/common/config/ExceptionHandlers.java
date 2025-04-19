package com.sin.lineage.server.common.config;

import com.sin.lineage.server.common.struct.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class ExceptionHandlers {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result<Void> handlerException(Exception e) {
        return Result.error(e.getMessage());
    }
}
