package com.learning.mvc.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/25  20:07
 */
@Controller
public class ExceptionCatchController {

    @RequestMapping("/testExceptionHandler")
    @ResponseBody
    public String testExceptionHandler() {
        System.out.println("testExceptionHandler///.....");
//        int i = 1 / 0;
        return "ok there is no exception";
    }

}
