package com.learning.ssm.spring.ioc.config;

import com.learning.ssm.spring.ioc.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/26  17:44
 */
@Configuration
public class PersonConfig {

    @Scope("prototype")
    @Bean
    public Person person(){
        return new Person();
    }
}
