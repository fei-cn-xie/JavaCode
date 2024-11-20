package com.learning.spring6.iocxml.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/16  15:26
 */
public class TestBook {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Book booK = (Book)context.getBean("book");
        System.out.println("set 方法注入 = " + booK);

        Book booConstructor = (Book)context.getBean("bookConstructor");
        System.out.println("构造器注入 = " + booConstructor);

        Book books = (Book)context.getBean("books");
        System.out.println("特殊值 = " + books);

    }
}
