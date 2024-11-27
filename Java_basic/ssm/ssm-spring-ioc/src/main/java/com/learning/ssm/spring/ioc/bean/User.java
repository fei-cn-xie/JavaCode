package com.learning.ssm.spring.ioc.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/26  20:35
 */
@Data
public class User implements InitializingBean, DisposableBean {
    private String name;
    private int age;

    public User() {
        System.out.println("构造器..........");
    }

    public void initMethod() {
        System.out.println("User initMethod ......");
    }

    public void destroyMethod() {
        System.out.println("User destroyMethod ......");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("[DisposableBean] ======= User destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("[initialization]======User afterPropertiesSet ......");
    }

    @Autowired
    public void setPerson( Person person) {
        System.out.println("属性设置setter.....");
    }


    @PreDestroy
    public void preDestroy() {
        System.out.println("[preDestroy]======User preDestroy");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("[postConstruct]======User postConstruct");
    }
}
