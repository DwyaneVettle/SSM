package com.sccs.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// 这个类是一个增强类，用于对User类的增强
@Component
@Aspect
@Order(0)
public class UserProxy {

    // 重用切入点
    @Pointcut(value = "execution(* com.sccs.spring.aop.User.update(..))")
    public  void point() {

    }
    // 前置方法，用于在User类方法执行之前执行
    // 前置通知
    @Before(value = "execution(* com.sccs.spring.aop.User.add(..))")
    public void before01() {
        System.out.println("before()方法执行了。。。。");
    }

    @Before(value = "point()")
    public void before() {
        System.out.println("before()方法执行了。。。。");
    }
    // 后置通知
    @After(value = "point()")
    public void after() {
        System.out.println("最终通知执行。。。。。");

    }

    // 最终通知
    @AfterReturning(value = "point()")
    public void afterReturning() {
        System.out.println("后置通知执行了。。。。");
    }

    // 环绕通知
    @Around(value = "point()")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕通知之前执行。。。");
        point.proceed();
        System.out.println("环绕通知之后执行。。。。");

    }
    // 异常通知
    @AfterThrowing(value = "point()")
    public void throws01() {
        System.out.println("异常通知执行了。。。。。。");
    }
}

