package com.daniu101.chapter13;

//定义小花
public class Xiaohua extends Persion{

    //重写，实现小花说话
    @Override
    public void say() {

        System.out.println("小花在说话");

    }

    //重写，实现小花写字
    @Override
    public void writing() {

        System.out.println("小花在写字");

    }

}
