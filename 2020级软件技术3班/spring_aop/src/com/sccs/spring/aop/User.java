package com.sccs.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class User {

    public void add() {
        System.out.println("add()方法执行了。。。。。。");
    }

    public void update() {
        System.out.println("update()方法执行了。。。。。");
        int a = 10/0;
    }
}
