package com.learning.mvc.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author fei
 * Version 1.0
 * Description 测试自定义拦截器
 * DATA 2024/11/25  17:57
 */
@Controller
public class HandlerController {

    @RequestMapping("/testInterceptor")
    public String testInterceptor() {

        return "interceptor";
    }

}
