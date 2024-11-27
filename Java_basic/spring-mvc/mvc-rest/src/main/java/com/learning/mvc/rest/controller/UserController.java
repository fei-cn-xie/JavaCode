package com.learning.mvc.rest.controller;

import com.learning.mvc.rest.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/24  19:18
 */
@Controller
public class UserController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser(HttpServletRequest request) {
        System.out.println("查询所有用户信息");
        request.setAttribute("user", "所有用户信息");
        return "test_rest";
    }

    @RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable String username, HttpServletRequest request) {
        System.out.println("查询单个用户信息" + username);
        request.setAttribute("user", "单个用户信息" + username);
        return "test_rest";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String addUser(User user, HttpServletRequest request) {
        System.out.println("增加用户" + user);
        request.setAttribute("user", "增加用户" + user);
        return "test_rest";
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String updateUser(User user, HttpServletRequest request) {
        System.out.println("更新用户" + user);
        request.setAttribute("user", "put更新用户 == " + user);
        return "test_rest";
    }

    @RequestMapping(value = "/user/{username}", method = RequestMethod.DELETE)
    public String deleteUser(HttpServletRequest request, @PathVariable String username) {
        System.out.println("删除用户" + username);
        request.setAttribute("user", "删除用户" + username);
        return "test_rest";
    }
}
