package com.daniu101.chapter12.extend;

//子类 狗
public class Dog extends Animal {

    //重写方法
    @Override
    public void run() {
        System.out.println("狗跑的很快");
    }

    //狗特有的方法
    public void work() {
        System.out.println("狗会看门");
    }
}