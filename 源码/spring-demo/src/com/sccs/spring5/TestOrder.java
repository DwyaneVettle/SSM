package com.sccs.spring5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

/**
 * @Author zoutr
 * @Description
 * @Date 2022/2/22
 **/
public class TestOrder {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/sccs/spring5/bean1.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.testOrder();

    }
}
