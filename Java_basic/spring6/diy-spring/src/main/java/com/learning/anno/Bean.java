package com.learning.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author fei
 * @Version 1.0
 * @Description 用于创建bean对象
 * @DATA 2024/11/19  15:25
 */
@Target(ElementType.TYPE) //标志使用再类上面
@Retention(RetentionPolicy.RUNTIME)
public @interface Bean {

}
