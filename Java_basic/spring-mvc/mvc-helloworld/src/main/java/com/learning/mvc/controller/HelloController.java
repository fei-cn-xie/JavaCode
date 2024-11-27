package com.learning.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/22  15:26
 */

@Controller
public class HelloController  {

    @RequestMapping(value = "/")
    public String index(){
        //返回视图名称
        return "index";
    }

    @RequestMapping(value = "/target")
    public String target(){
        //返回视图名称
        return "target";
    }


    //如果不使用@RequestParam注解, 保证形参名与请求参数中的名称一致
    @RequestMapping(value = "/testParam")
    public String testParam(@RequestParam("username") String username, String password){
        return "success";
    }

    @RequestMapping(value = "/testPOJO")
    public String testPOJO(User user){
        System.out.println(user);
        return "success";
    }



}
