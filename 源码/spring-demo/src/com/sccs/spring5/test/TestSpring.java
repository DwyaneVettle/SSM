package com.sccs.spring5.test;

import com.sccs.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zoutr
 * @Description
 * @Date 2022/2/22
 **/
public class TestSpring {

    @Test
    public void testAdd() {
        // 1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/sccs/spring5/bean1.xml");
        // 2.获取配置文件的对象
        User user = context.getBean("user", User.class);
        // 3.输出结果
        System.out.println(user);
        user.add();
    }
}
