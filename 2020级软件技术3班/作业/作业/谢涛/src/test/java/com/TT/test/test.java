package com.TT.test;

import com.TT.pojo.Employee;
import com.TT.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = context.getBean(Student.class);
        Employee employee = context.getBean(Employee.class);

        // 学生
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getSex());
        student.test();

        //员工
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getHeight());
        System.out.println(employee.getSex());
        System.out.println(employee.getAge());
        employee.test();


    }
}
