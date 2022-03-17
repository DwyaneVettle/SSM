package com.sccs.spring.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersonProxy {

    @Before(value = "execution(* com.sccs.spring.aopanno.User.add(..))")
    public void before() {
        System.out.println("Person类的before()执行了。。。。");
    }
}
