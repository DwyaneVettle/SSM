package com.sccs.spring.bean;

public class Order {
    private String oName;

    public Order() {
        System.out.println("1.调用无参构造创建bean。。。");
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName;
        System.out.println("2.调用了set方法。。。");
    }
    public void initMethod() {
        System.out.println("3.实例化方法执行。。。。");
    }

    public void destoryMethod() {
        System.out.println("5.销毁方法执行。。。。");
    }
}
