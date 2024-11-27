package com.learning.ssm.ssmspringaop.calculator;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/27  10:48
 */
@Component
public class MathCalculatorImp implements MathCalculator {

    public int add(int a, int b) {
        System.out.println("方法执行中 .... ");
        return a + b;
    }

}
