package com.sccs.spring.test;

import com.sccs.spring.bean.Order;
import com.sccs.spring.bean.Student;
import com.sccs.spring.factorybean.Course;
import com.sccs.spring.factorybean.MyBean;
import com.sccs.spring.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config02.xml");
        Student student01 = context.getBean("student", Student.class);
        Student student02 = context.getBean("student", Student.class);
        System.out.println(student01);
        System.out.println(student02);

    }

    @Test
    public void test03() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config03.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void test04() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config03.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println("4.创建对象。。。。");
        System.out.println(order);
        ((ClassPathXmlApplicationContext)context).close();
    }
}
