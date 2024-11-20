package learning.spring6.aop.annotationaop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/20  12:11
 */
@Configuration
@ComponentScan(value = "learning.spring6.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true) //强制使用 CGLIB 代理（基于类的代理）;默认情况下，Spring 会选择 JDK 动态代理（基于接口的代理）。
public class SpringConfig {

}
