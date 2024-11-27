package com.learning.ssm.ssmspringaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/27  11:44
 */
@Component
@Aspect
@Order(1) //
public class LogAspect {

    @Before("execution(public * com.learning.ssm.ssmspringaop.calculator.MathCalculator.add(int, *))")
    public void aspectBefore(JoinPoint joinPoint) throws Throwable {
        System.out.println(joinPoint.getSignature().getDeclaringTypeName() + "====.====" + joinPoint.getSignature().getName());
        System.out.println("before ..... ");
    }
}
