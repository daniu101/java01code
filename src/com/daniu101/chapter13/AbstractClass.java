package com.daniu101.chapter13;

//抽象类中可以有变量、常量、成员方法、抽象方法、构造方法
public abstract class AbstractClass {

    //构造方法
    public AbstractClass(){
    }

    //变量
    int age;
    //常量
    final int weight = 0;

    //成员方法
    public void run(){
        System.out.println("人类可以跑跳");
    }

    //抽象方法
    public abstract void eat();

}
