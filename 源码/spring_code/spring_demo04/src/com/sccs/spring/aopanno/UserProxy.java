package com.sccs.spring.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强类，实现不同的通知
@Component
@Aspect  // 生成代理对象
@Order(2)
public class UserProxy {

    // 相同切入点的抽取
    @Pointcut(value = "execution(* com.sccs.spring.aopanno.User.add(..))")
    public void point() {

    }

    // 前置通知-在增强方法之前增强
    // @Before表示前置通知
    @Before(value = "point()")
    public void before() {
        System.out.println("before()前置通知...");
    }

    // 最终通知
    @After(value = "execution(* com.sccs.spring.aopanno.User.add(..))")
    public void after() {
        System.out.println("after()方法执行了。。。");
    }

    // 后置通知
    @AfterReturning(value = "execution(* com.sccs.spring.aopanno.User.add(..))")
    public void afterReturning() {
        System.out.println("afterReturning()方法执行了。。。");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.sccs.spring.aopanno.User.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing()方法执行了。。。");
    }

    // 环绕通知
    @Around(value = "execution(* com.sccs.spring.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around()方法环绕之前。。。");
        // 被增强的方法执行
        point.proceed();
        System.out.println("around()方法环绕之后。。。");
    }

}
