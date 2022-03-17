package com.sccs.spring5.bean;

public class Orders {
    private String oName;
    // 无参构造创建对象
    public Orders() {
        System.out.println("1.执行无参构造创建bean实例。。。。");
    }

    public void setoName(String oName) {
        this.oName = oName;
        System.out.println("2.调用set方法设置属性值。。。。");
    }
    // 创建执行的初始化方法
    public void initMethod() {
        System.out.println("3.执行初始化方法。。。。");
    }
    // 创建执行的销毁方法
    public void destroyMethod() {
        System.out.println("5.执行销毁方法。。。。");
    }
}
