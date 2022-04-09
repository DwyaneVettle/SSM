package com.sccs.spring.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component(value="user")
@Service(value="user")
public class UserService {

    public void test() {
        System.out.println("test()方法执行了。。。。。");
    }
}
