package com.sccs.spring.aop;

public class Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        User user = new User();
        Class<?> aClass = Class.forName("com.sccs.spring.aop.User");
        Class<?> aClass01 = User.class;
        Class<?> aClass02 =user.getClass();
    }
}
