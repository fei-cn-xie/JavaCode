package com.learning.ssm.spring.ioc.processor;

import com.learning.ssm.spring.ioc.bean.UUID;
import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/26  22:04
 */
@Component
public class UUIDPostProcessor implements BeanPostProcessor {
    @SneakyThrows
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(UUID.class) && field.getType().equals(String.class)) {
                field.setAccessible(true);
                System.out.println("执行000000000000");
                String uuid = java.util.UUID.randomUUID().toString();
                field.set(bean,uuid);
            }
        }
        return bean;
    }
}
