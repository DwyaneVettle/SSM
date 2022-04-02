package com.sccs.spring5.test;

import com.sccs.spring5.bean.Student;
import com.sccs.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zoutr
 * @Description
 * @Date 2022/2/22
 **/
public class TestBean {

    @Test
    public void testBean1() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/sccs/spring5/bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testBean2() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/sccs/spring5/bean4.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
        student.test();
    }
}
