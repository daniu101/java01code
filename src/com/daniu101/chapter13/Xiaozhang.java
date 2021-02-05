package com.daniu101.chapter13;

//定义小张
public class Xiaozhang extends Persion{

    //重写，实现小张说话
    @Override
    public void say() {

        System.out.println("小张在说话");

    }

    //重写，实现小张写字
    @Override
    public void writing() {

        System.out.println("小张在写字");

    }

}
