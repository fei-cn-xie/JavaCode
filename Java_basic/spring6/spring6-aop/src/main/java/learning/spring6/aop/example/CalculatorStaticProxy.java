package learning.spring6.aop.example;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/19  16:58
 */
public class CalculatorStaticProxy implements Calculator {

    //传入目标对象
    private Calculator calculator;
    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        //输出日志
        System.out.println("日志: a="+a+",b = "+b);

        //调用目标方法
        int result = calculator.add(a, b);
        //输出日志
        System.out.println("方法内部 result: " + result);
        return 0;
    }

    @Override
    public int sub(int a, int b) {
        return 0;
    }

    @Override
    public int mul(int a, int b) {
        return 0;
    }

    @Override
    public int div(int a, int b) {
        return 0;
    }
}
