package com.learning.mvc.domain_obj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/23  17:25
 */
@Controller
public class ViewController {

    @RequestMapping("test_view")
    public String test_view() {
        return "test_view";
    }

    @RequestMapping("testView")
    public String testView() {

        return "success";
    }

    @RequestMapping("testForward")
    public String testForward() {
        return "forward:/test_view";
    }

    @RequestMapping("testRedirect")
    public String testRedirect() {
        return "redirect:/test_view";
    }
}
