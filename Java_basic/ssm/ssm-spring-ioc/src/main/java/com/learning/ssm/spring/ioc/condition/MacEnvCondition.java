package com.learning.ssm.spring.ioc.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/26  18:27
 */
public class MacEnvCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String osEnv = context.getEnvironment().getProperty("OS");
        System.out.println(osEnv);
        if ("Mac".equals(osEnv)) {
            return true;
        }
        //返回true标识条件匹配
        return false;
    }
}
