package com.learning.mvc.rest.controller;

import com.learning.mvc.rest.bean.Employee;
import com.learning.mvc.rest.dao.EmployeeDao;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/24  22:40
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView employee(ModelAndView modelAndView) {
        modelAndView.addObject("employeeList",employeeDao.getAll());
        System.out.println(employeeDao.getAll());
        modelAndView.setViewName("employee");

        return modelAndView;
    }


    @RequestMapping("/testResponse")
    public String testResponse() {
        System.out.println(employeeDao.getAll());
//        System.out.println(responseEntity);
        return employeeDao.getAll().toString();
    }

    @RequestMapping("/testResponseEmployee")
    public Employee testResponseEmployee() {
        Employee employee = employeeDao.get(1005);
        System.out.println(employee);
        return employee;
    }
}
