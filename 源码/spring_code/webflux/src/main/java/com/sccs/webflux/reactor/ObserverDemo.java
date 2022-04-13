package com.sccs.webflux.reactor;

import java.util.Observable;

public class ObserverDemo extends Observable {

    public static void main(String[] args) {
        ObserverDemo observer = new ObserverDemo;
        // 添加观察者
        observer.addObserver((o,arg) -> {
            System.out.println("这里发生了变化");
        });
        observer.addObserver((o,arg) -> {
            System.out.println("手动被观察者通知，准备改变");
        });
        // 需要调用如下方法才能执行输出语句
        observer.setChanged(); // 观察数据变化
        observer.notifyObservers(); // 通知
    }
}
