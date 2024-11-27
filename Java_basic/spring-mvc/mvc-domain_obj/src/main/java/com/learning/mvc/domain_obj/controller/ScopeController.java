package com.learning.mvc.domain_obj.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/23  10:48
 */
@Controller
public class ScopeController {

    //使用Servlet API向request域对象共享数据
    @RequestMapping("/testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest request) {
        request.setAttribute("msg111", "testRequestByServletAPI + " + request);
        return "success";
    }

    @RequestMapping("/testModleAndView")
    public ModelAndView testModelAndView(){

        /**
         * ModelAndView包含model和view功能
         * model主要用于向请求域中共享数据
         * view主要用于设置视图, 实现页面跳转
         */
        ModelAndView modelAndView = new ModelAndView();
        //向请求域中共享数据
        //modelAndView.addObject("msg111", "testModelAndView + " + modelAndView);
        //设置视图, 实现页面跳转
        modelAndView.setViewName("success");
        modelAndView.addObject("msg111", "testModelAndView + " + modelAndView);
        return modelAndView;
    }

    @RequestMapping("/testSession")
    public String testSession(HttpSession session) {
        session.setAttribute("testSession","获取session域中数据" + session.getId());
        return "success";
    }

    @RequestMapping("/testApp")
    public String testApp(HttpSession session) {
        ServletContext servletContext = session.getServletContext();
        servletContext.setAttribute("testApp","APPLication ServletContext" + servletContext);
        return "success";
    }
}
