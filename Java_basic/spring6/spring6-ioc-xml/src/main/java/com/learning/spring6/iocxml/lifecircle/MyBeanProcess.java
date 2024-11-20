package com.learning.spring6.iocxml.lifecircle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/18  19:07
 */
public class MyBeanProcess implements BeanPostProcessor {
    //前置处理器
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3. 在初始化之前调用后置处理器");
        return bean;
    }

    //后置处理器
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5. 在初始化之后调用后置处理器");
        return bean;
    }
}
