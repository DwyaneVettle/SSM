package com.sccs.spring.test;

import com.sccs.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

}
