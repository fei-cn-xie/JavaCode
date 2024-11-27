package com.learning.mvc.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/25  20:07
 */
@ControllerAdvice
public class ExceptionCatchController2 {

    @ExceptionHandler(value = {ArithmeticException.class, NullPointerException.class})
    public String testExceptionHandler(Exception e) {
        return "error";
    }

}
