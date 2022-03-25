package com.sccs.spring.test;

import com.sccs.spring.conllection.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXml {

    @Test
    public void test01( ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config01.xml");
        Student s = context.getBean("student", Student.class);
        s.test();
    }
}
