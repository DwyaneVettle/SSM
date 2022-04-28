package com.sccs.spring_web02.reflect;

public class Reflect {

    public static void main(String[] args) throws Exception {
        User user1 = new User();
        Class<?> aClass = Class.forName("com.sccs.spring_web02.reflect.User");
        Class<User> userClass = User.class;
        Class<? extends User> aClass1 = user1.getClass();
        Object o = aClass.newInstance();
        User user = userClass.newInstance();
        User user2 = aClass1.newInstance();
        System.out.println(o);
        System.out.println(user);
        System.out.println(user2);
    }
}
