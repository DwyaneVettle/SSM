package com.sccs.spring.test;

import com.sccs.spring.Orders;
import com.sccs.spring.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring_config.xml");
        Student student = context.getBean(Student.class);
        System.out.println(student.getsName());
        System.out.println(student.getsId());
        System.out.println(student.getsSex());
            student.add();
    }

    @Test
    public void test02() {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.testOrder();

    }
}
