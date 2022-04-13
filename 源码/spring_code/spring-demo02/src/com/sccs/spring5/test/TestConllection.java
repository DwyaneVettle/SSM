package com.sccs.spring5.test;

import com.sccs.spring5.autowire.Emp;
import com.sccs.spring5.bean.Orders;
import com.sccs.spring5.conllection.Book;
import com.sccs.spring5.conllection.Course;
import com.sccs.spring5.conllection.Student;
import com.sccs.spring5.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zoutr
 * @Description
 * @Date 2022/2/23
 **/
public class TestConllection {

    @Test
    public void testConllection01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
        student.test();

    }

    @Test
    public void testConllection02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config2.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        System.out.println(book1);
        System.out.println(book2);

    }

    @Test
    public void test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config3.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void test04() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("4.获取创建bean实例对象。。。。");
        System.out.println(orders);
        // 手动销毁bean对象
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    public void test05() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
