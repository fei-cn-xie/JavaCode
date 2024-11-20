package learning.spring6.aop.annotationaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/20  12:31
 */
public class TestAOP {
    @Test
    public void test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext("learning.spring6.aop.annotationaop");
        Calculator bean = context.getBean(Calculator.class);
        System.out.println(bean.add(1,2));
//        bean.div(1,0);
    }
}
