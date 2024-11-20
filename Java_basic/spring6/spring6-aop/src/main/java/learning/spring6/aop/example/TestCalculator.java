package learning.spring6.aop.example;

import org.junit.jupiter.api.Test;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/19  17:26
 */
public class TestCalculator {

    @Test
    public void test01(){

        //创建代理对象
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator calculator =  (Calculator)proxyFactory.getProxy();
        calculator.add(1,2);
        calculator.mul(4,2);


    }
}
