package com.learning.spring6.validator.by_interface;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/21  16:03
 */
public class PersonValidator implements Validator {

    /**
     * supports方法表示这个校验需要用在哪个类型上
     * @param clazz
     * @return
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }


    /**
     * 具体校验逻辑的地方
     * @param target
     * @param errors
     */
    @Override
    public void validate(Object target, Errors errors) {
        //name 不为空

        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty", "name is null");

        //age 0~200
        Person person = (Person) target;
        if(person.getAge() < 0){
            errors.rejectValue("age", "ageless0", "age is null");
        }else if(person.getAge() > 200){
            errors.rejectValue("age", "ageover200", "age is greater than 200");
        }
    }
}
