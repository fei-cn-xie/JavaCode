package com.learning.spring6.iocxml.auto.controller;

import com.learning.spring6.iocxml.auto.service.UserService;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/18  19:29
 */
public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        userService.addUserService();
        System.out.println("Controller method addUser executed");
    }


}
