package com.learning.spring6.validator.by_selfdefine;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.lang.annotation.*;

/**
  * @Author fei
  * @Version 1.0
  * @Description TODO
  * @DATA 2024/11/21  17:17
  */

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Repeatable(CannotBlank.List.class)
@Constraint(validatedBy = CannotBlankValidator.class)
public @interface CannotBlank {
    //默认提示信息
    String message() default "不能包含空格";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface List {
        CannotBlank[] value();
    }
}
