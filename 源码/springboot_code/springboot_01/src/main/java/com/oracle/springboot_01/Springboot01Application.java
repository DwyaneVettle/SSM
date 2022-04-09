package com.oracle.springboot_01;

import com.mysql.jdbc.Driver;
import com.oracle.springboot_01.bean.User;
import com.oracle.springboot_01.configuration.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.oracle")
public class Springboot01Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(Springboot01Application.class, args);
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
       /* User user01 = run.getBean("user", User.class);
        User user02 = run.getBean("user", User.class);
        System.out.println("组件比较：" + (user01 == user02));
        // 配置类本身也是一个组件
        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);

        *//*如果proxyBeanMethods = true则调用配置类方法得到同一个对象
        * 如果proxyBeanMethods = false则调用配置类方法得到不同对象*//*
        User user03 = bean.user();
        User user04 = bean.user();
        System.out.println("注解代理对象比较："+(user03 == user04));

        // 测试@Import组件
        String[] beanNames = run.getBeanNamesForType(User.class);
        for (String s : beanNames) {
            System.out.println(s);
        }
        Driver driver = run.getBean(Driver.class);
        System.out.println(driver);*/

        boolean pet = run.containsBean("pet");
        System.out.println("容器中是否包含pet：" + pet );
        boolean user = run.containsBean("user");
        System.out.println("容器中是否包含user：" + user );
        boolean aa = run.containsBean("007");
        System.out.println("容器中是否包含aa：" + aa );
        boolean bb = run.containsBean("008");
        System.out.println("容器中是否包含bb：" + bb );
    }
}
