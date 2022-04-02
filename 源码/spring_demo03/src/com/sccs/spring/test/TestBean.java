package com.sccs.spring.test;

import com.sccs.spring.config.SpringConfig;
import com.sccs.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config01.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.test();
    }

    @Test
    public void test02() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.test();
    }
}
