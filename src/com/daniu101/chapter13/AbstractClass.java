package com.daniu101.chapter13;

//抽象类中可以有变量、常量、成员方法、抽象方法、构造方法
public abstract class AbstractClass {

    //构造方法
    public AbstractClass(){
    }

    //变量
    private int age;
    //常量
    private static  int weight;

    //成员方法
    public void run(){
        System.out.println("人类可以跑跳");
    }

    //抽象方法
    public abstract void eat();

}
