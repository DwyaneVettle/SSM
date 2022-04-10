package com.sccs.spring.test;

public class User {

    // 用new的方式需要配置才能注册到IOC容器中
   /* public static void main(String[] args) {
        User user = new User();
    }*/
    public void test() {
        System.out.println("User的test()方法执行了。。。");
    }
}
