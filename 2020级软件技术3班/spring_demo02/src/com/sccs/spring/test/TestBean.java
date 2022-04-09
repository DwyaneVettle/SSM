package com.sccs.spring.test;

import com.sccs.spring.controller.UserController;
import com.sccs.spring.repository.UserRepository;
import com.sccs.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zoutr
 * @Description
 * @Date 2022/4/9
 * @Copyright 四川城市职业学院
 **/
public class TestBean {

    @Test
    public void test01() {
        String config = "spring_config.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        UserService userService = context.getBean("user", UserService.class);
        userService.test();
    }

    @Test
    public void test02() {
        String config = "spring_config.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        UserController userController = context.getBean("userController", UserController.class);
        userController.test();
    }

    @Test
    public void test03() {
        String config = "spring_config.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        UserRepository userRepository = context.getBean("userRepository", UserRepository.class);
        userRepository.test();
    }
}
