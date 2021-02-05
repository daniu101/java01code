package com.daniu101.chapter13.mutiabstract;

//具体实现类 小刚
public class Xiaogang extends AsianHuman{

    @Override
    public void say() {

        System.out.println("小刚说话");

    }

    @Override
    public void writing() {

        System.out.println("小刚写字");

    }

    @Override
    public void asianSquatDown() {

        System.out.println("小刚会亚洲蹲");

    }

}
