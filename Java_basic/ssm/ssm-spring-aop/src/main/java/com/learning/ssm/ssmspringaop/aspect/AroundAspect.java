package com.learning.ssm.ssmspringaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/27  14:17
 */
@Aspect
@Component
public class AroundAspect {

    @Around("execution(public int com.learning..calculator.*.add(int,int))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("[环绕] ----- 前置通知");
        Object result = null;

        try {
            result = joinPoint.proceed();
            System.out.println("[环绕] ----- 返回通知");

        }catch (Throwable throwable){
            System.out.println("[环绕] --- 异常通知");
        }finally {
            System.out.println("[环绕] ----- 后置通知");
        }
        return result;
    }
}
