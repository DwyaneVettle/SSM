package com.oracle.springboot_01.configuration;

import com.mysql.jdbc.Driver;
import com.oracle.springboot_01.bean.Pet;
import com.oracle.springboot_01.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;


/*
* @Configuration:告诉Spring Boot这是一个配置类，等同于xml文件
* 1.配置类使用@Bean给容器标注组件，默认是单实例的
* 2.配置类本身也是一个组件
* 3.proxyBeanMethods默认值为true，标识代理bean的方法，用来解决组件依赖
*     全配置Full(proxyBeanMethods = true)-调用方法得到同一个对象
*     轻量级配置Lite(proxyBeanMethods = false)-调用方法得到不同对象
*     也就是说如果为true，每次都会检查容器是否有这个对象，如果为false则
*     不会检查对象是否存在，直接创建
*  */
/*  @Import({User.class, Driver.class})
*       给容器自动创建这两个类型的组件，默认组件的名字就是该类的全类名*/
@Import({User.class, Driver.class})
@Configuration(proxyBeanMethods = false)
@ImportResource
public class MyConfig {

    /*
    *  @Bean给容器添加组件，以方法名作为组件id(也可以在标签上自定义id)，
    *  返回类型就是组件类型，返回的值就是容器中的实例
    * 外部调用这个方法获取的对象都是注册到容器中的单实例对象
    * */
    @Bean
    @ConditionalOnBean(name = "pet")
    public User user() {
        return new User("michela", 20);
    }

    // @Bean
    public Pet pet() {
        return new Pet("tom猫");
    }
}
