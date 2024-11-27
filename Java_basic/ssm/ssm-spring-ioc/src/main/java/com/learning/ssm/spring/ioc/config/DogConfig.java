package com.learning.ssm.spring.ioc.config;

import com.learning.ssm.spring.ioc.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/26  17:45
 */
@Configuration
public class DogConfig {
    @Bean
    public Dog dog() {
        return new Dog();
    }
}
