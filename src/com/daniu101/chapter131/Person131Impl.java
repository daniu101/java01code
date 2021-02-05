package com.daniu101.chapter131;

/*
 最终实现的子类
 */
public class Person131Impl extends Person131SonSon{

    @Override
    public int say() {
        System.out.println("同孙子的说话");
        return 0;
    }

    @Override
    public void write() {
        System.out.println("同孙子的写字");
    }

    @Override
    public void work() {
        System.out.println("同孙子的工作");
    }
}
