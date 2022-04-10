package com.sccs.spring.test;

import com.sccs.spring.config.TX_config;
import com.sccs.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class TestBean {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void test02() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TX_config.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void test03() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TX_config.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void test04() {
        // 创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        // 通过context对象注册User的bean对象到容器中
        context.refresh();
        context.registerBean("user01",User.class, () -> new User());
        // 获取注册对象
        User user = (User)context.getBean("user01");
        user.test();
    }

}
