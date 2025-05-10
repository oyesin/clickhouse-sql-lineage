package com.sin.lineage.server.common.config;

import com.sin.lineage.server.common.struct.Result;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class ExceptionHandlers {

    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<Object> handleValidationException(MethodArgumentNotValidException e) {
        return e.getAllErrors().stream()
                .findFirst()
                .map(objectError -> Result.error(objectError.getDefaultMessage()))
                .orElseGet(() -> Result.error(e.getMessage()));
    }

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result<Void> handlerException(Exception e) {
        return Result.error(e.getMessage());
    }
}
