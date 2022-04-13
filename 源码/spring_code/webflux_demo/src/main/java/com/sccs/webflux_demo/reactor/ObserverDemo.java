package com.sccs.webflux_demo.reactor;

import java.util.Observable;

public class ObserverDemo extends Observable {

    public static void main(String[] args) {
        ObserverDemo observerDemo = new ObserverDemo();
        observerDemo.addObserver((o,arg) -> {
            System.out.println("这里发生了变化");
        });
        observerDemo.addObserver((o,arg) -> {
            System.out.println("注意观察，这里要变化了");
        });
        // 需要调用如下方法才能执行输出语句
        observerDemo.setChanged(); // 观察数据变化
        observerDemo.notifyObservers(); // 通知
    }
}
