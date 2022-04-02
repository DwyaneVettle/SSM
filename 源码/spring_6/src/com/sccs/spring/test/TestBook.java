package com.sccs.spring.test;

import com.sccs.spring.entity.Book;
import com.sccs.spring.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {

    @Test
    public void testadd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config01.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setBookId("01");
        book.setBookname("天龙八部");
        book.setBstatus("1");
        bookService.addBook(book);

    }
    @Test
    public void testupdate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config01.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setBookId("01");
        book.setBookname("笑傲江湖01");
        book.setBstatus("01");
        bookService.updateBook(book);

    }
    @Test
    public void testdelete() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config01.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.deleteBook("01");
    }
    @Test
    public void testquery() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config01.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        int count = bookService.findCount();
        System.out.println("count = " + count);
        
    }
    @Test
    public void testqueryObject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config01.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = bookService.findObject("111");
        System.out.println(book);

    }
    @Test
    public void testqueryList() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config01.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> bookList = bookService.findList();
        System.out.println(bookList);

    }
    @Test
    public void testBatchUpdate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config01.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> list = new ArrayList<Object[]>();
        Object[] obj1 = {"333","红楼梦","2"};
        Object[] obj2 = {"444","西游记","2"};
        Object[] obj3 = {"555","三国演义","1"};
        Object[] obj4 = {"666","水浒传","1"};
        Object[] obj5 = {"777","西厢记","2"};
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        bookService.batchAdd(list);

    }
    @Test
    public void testBatchUpdate02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config01.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> list = new ArrayList<Object[]>();
        Object[] obj1 = {"红楼梦-贾宝玉","1","333"};
        Object[] obj2 = {"西游记-孙悟空","1","444"};
        list.add(obj1);
        list.add(obj2);
        bookService.batchUpdate(list);

    }
    @Test
    public void testBatchDelete() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config01.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> list = new ArrayList<Object[]>();
        Object[] obj1 = {"333"};
        Object[] obj2 = {"444"};
        list.add(obj1);
        list.add(obj2);
        bookService.batchDelete(list);
    }
}
