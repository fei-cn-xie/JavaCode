package com.learning.spring6.iocxml.school;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/16  18:47
 */
public class TestStu {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-p.xml");
        Student student = (Student) context.getBean("student_p");
        System.out.println(student);
    }
}
