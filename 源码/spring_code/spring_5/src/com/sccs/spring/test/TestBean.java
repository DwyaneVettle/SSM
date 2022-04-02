package com.sccs.spring.test;

import com.sccs.spring.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/sccs/spring/bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

}
