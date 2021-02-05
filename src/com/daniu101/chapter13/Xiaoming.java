package com.daniu101.chapter13;

//定义小明
public class Xiaoming extends Persion{

    //重写，实现小明说话
    @Override
    public void say() {

        System.out.println("小明在说话");

    }

    //重写，实现小明写字
    @Override
    public void writing() {

        System.out.println("小明在写字");

    }

}
