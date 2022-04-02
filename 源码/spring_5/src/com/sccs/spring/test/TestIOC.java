package com.sccs.spring.test;

import com.sccs.spring.Book;
import com.sccs.spring.Order;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {

    @Test
    public void test01() {
        // 1.加载xml文件
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        // 2.加载对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        System.out.println(book.getbAuthor());
        System.out.println(book.getbName());
        System.out.println("book.getAddress() = " + book.getAddress());
    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println(order);
        System.out.println(order.getOaddr());
        System.out.println(order.getOname());
        order.test();
    }
}
