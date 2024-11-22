package com.learning.mvc.anno.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/22  18:52
 */
public class Controller {
    @RequestMapping(value = "/")
    public String index(){
        //返回视图名称
        return "index";
    }
}
