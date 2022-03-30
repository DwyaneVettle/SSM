package com.sccss.spring.Test;

import com.sccss.spring.conllection.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test001 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Teacher teacher = context.getBean("teacher", Teacher.class);
        teacher.test();

    }
}
