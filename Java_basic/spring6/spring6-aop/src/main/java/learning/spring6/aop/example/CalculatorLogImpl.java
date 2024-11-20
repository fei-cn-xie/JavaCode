package learning.spring6.aop.example;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/19  16:47
 */
public class CalculatorLogImpl implements Calculator{
    @Override
    public int add(int a, int b) {
        System.out.println("日志: a="+a+",b = "+b);
        int result = a + b;
        System.out.println("日志: result =  "+result);
        System.out.println("方法内部 result: " + result);
        return result;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("日志: a="+a+",b = "+b);
        int result = a - b;
        System.out.println("日志: result =  "+result);
        System.out.println("方法内部 result: " + result);
        return result;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("日志: a="+a+",b = "+b);
        int result = a * b;
        System.out.println("日志: result =  "+result);
        System.out.println("方法内部 result: " + result);
        return result;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("日志: a="+a+",b = "+b);
        int result = a / b;
        System.out.println("日志: result =  "+result);
        System.out.println("方法内部 result: " + result);
        return result;
    }
}
