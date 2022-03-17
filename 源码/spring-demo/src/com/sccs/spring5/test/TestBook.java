package com.sccs.spring5.test;

import com.sccs.spring5.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zoutr
 * @Description
 * @Date 2022/2/22
 **/
public class TestBook {
    @Test
    public void testBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/sccs/spring5/bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.test();
    }

}
