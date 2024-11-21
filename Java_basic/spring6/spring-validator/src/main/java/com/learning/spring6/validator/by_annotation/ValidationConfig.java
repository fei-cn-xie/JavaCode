package com.learning.spring6.validator.by_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/21  16:20
 */

@Configuration
@ComponentScan("com.learning.spring6.validator.by_annotation")
public class ValidationConfig {

    @Bean
    public LocalValidatorFactoryBean getLocalValidatorFactoryBean() {
        return new LocalValidatorFactoryBean();
    }

}

