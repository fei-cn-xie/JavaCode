package com.learning.ssm.spring.ioc;

import com.learning.ssm.spring.ioc.bean.Dog;
import com.learning.ssm.spring.ioc.bean.Mouse;
import com.learning.ssm.spring.ioc.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * Author fei
 * Version 1.0
 * Description 主类的入口`
 * DATA 2024/11/26  16:46
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //1. 跑起一个Spring的应用, 获取一个ApplicationContext, 即ioc容器
        ConfigurableApplicationContext ioc = SpringApplication.run(Application.class, args);
        System.out.println("=============================");
        System.out.println(ioc.getBean(Mouse.class));
    }
}
