package learning.spring6.aop.annotationaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author fei
 * @Version 1.0
 * @Description 切面类
 * @DATA 2024/11/20  12:04
 */
@Aspect //表示切面类
@Component //表示在spring的ioc容器中进行管理
public class LogAspect {

    //设置切入点和通知类型
    //通知类型: 前置 返回  异常  后置  环绕
    //@Before(), @AfterReturning(), @AfterThrowing(), @After(), @Around()


    @Before(value = "execution(public int learning.spring6.aop.annotationaop.Calculator.add(int, int))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("前置通知... ====>>>> " + methodName + " === " + Arrays.toString(args) );
    }

    @AfterReturning(value = "execution(public * learning.spring6.aop.annotationaop.Calculator.add(..))", returning = "anynameok")
    public void afterReturningMethod(JoinPoint joinPoint, int anynameok) {
        Signature signature = joinPoint.getSignature();
        System.out.println("返回后通知吗>>>>>> " + anynameok);
    }

    @AfterThrowing(value = "execution(public * learning.spring6.*.*.*.add(..))", throwing = "anynameok")
    public void afterThrowingMethod(JoinPoint joinPoint, Throwable anynameok) {
        System.out.println("异常通知...>>>>> " + anynameok);
    }

    @After(value = "execution(public * learning.spring6.aop.annotationaop.Calculator.add(int, int))")
    public void after(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("后置通知????? ====>>>> " + methodName);
    }

    @Around(value = "execution(public int learning.spring6.aop.annotationaop.Calculator.add(int, int))")
    public Object around(ProceedingJoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        String string = Arrays.toString(args);
        System.out.println("环绕通知");
        Object result = null;
        try{
            System.out.println("环绕通知>>>> 目标方法之前");
            //调用目标方法
            result = joinPoint.proceed();
            System.out.println("环绕通知>>> 目标方法之后执行");

        } catch (Throwable e) {

            System.out.println("环绕通知>>>> 目标方法出现异常执行");
            throw new RuntimeException(e);
        } finally {
            System.out.println("环绕通知>>> 目标方法完成后执行");
        }

        return result;

    }

    @Pointcut(value = "execution(public int learning.spring6.aop.annotationaop.Calculator.add(int, int))")
    public void pointCut() {
    }

    @After(value = "pointCut()")
    public void after(){
        System.out.println("后置通知📢📢📢: 使用pointCut重用切入点表达式");
    }
}
