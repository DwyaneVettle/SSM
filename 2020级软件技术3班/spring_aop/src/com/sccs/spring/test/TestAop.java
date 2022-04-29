package com.sccs.spring.test;

import com.sccs.spring.aop.User;
import com.sccs.spring.config.AopConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void test01() {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring_aop.xml");
        User user = context.getBean("user", User.class);
        user.add();
        user.update();

    }

    @Test
    public void test02() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        User user = context.getBean("user", User.class);
        user.update();
    }
}
