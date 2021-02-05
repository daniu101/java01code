package com.daniu101.chapter131;

/*
 抽象父类
 abstract 关键字修饰
 */
public abstract class Person131Spec {

    public  Person131Spec(){
    }

    /*
    1：abstract 关键字修饰
    2：没有具体实现功能
    # 只有方法的定义，没有具体的实现
     */
    public abstract int say();

    public abstract void write();

    //变量、常量、成员方法、抽象方法、构造方法
    String name;
    final String NAME_PROJECT = "我是项目名字";

    public void write2(){
        System.out.println("我是成员方法");
    }

}
