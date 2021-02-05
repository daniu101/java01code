package com.daniu101.chapter131;

/*
 抽象父类
 abstract 关键字修饰
 */
public abstract class Person131 {

    /*
    1：abstract 关键字修饰
    2：没有具体实现功能
    # 只有方法的定义，没有具体的实现
     */
    public abstract int say();

    public abstract void write();

    final String NAME_PROJECT = "我是抽象类中常量的项目名";

    public void write2(){
        System.out.println("我是抽象类中的成员方法");
    }
}
