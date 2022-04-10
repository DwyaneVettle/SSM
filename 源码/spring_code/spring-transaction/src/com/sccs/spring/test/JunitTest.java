package com.sccs.spring.test;

import com.sccs.spring.service.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/*
* @RunWith指定JUnit的版本
* @ContextConfiguration加载配置文件，相当于创建了ClassPathXmlApplicationContext对象*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring_config.xml")
public class JunitTest {

    // 注入对象
    @Autowired
    private UserService userService;

    @Test
    public void test01() {
        // 直接调用方法输出
        userService.accountMoney();
    }
}
