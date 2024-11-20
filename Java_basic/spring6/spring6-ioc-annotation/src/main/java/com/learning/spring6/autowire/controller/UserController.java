package com.learning.spring6.autowire.controller;

import com.learning.spring6.autowire.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/19  12:36
 */

@Controller
public class UserController {
//    @Autowired
//    public void setUserService( UserService userService) {
//        this.userService = userService;
//    }

    //注入service
    //属性注入 //根据类型找到对应的对象, 完成注入
    @Autowired
    private UserService userService;

    public void addUser(){
        System.out.println("是嫌累 Controller");
        userService.add();
    }
}
