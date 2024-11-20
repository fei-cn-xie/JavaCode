package com.learning.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/16  17:47
 */
public class TestEmp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        Emp emp = (Emp) context.getBean("empA");
        System.out.println(emp);
        emp.work();
    }
}
