package com.daniu101.chapter10.privatetest;

public class AnimalPTest {

    public static void main(String[] args) {

        //创建一个动物对象
        AnimalP an = new AnimalP();

        //修改动物的身高 -100
        an.setHeight(-100);
        System.out.println("an.height:"+an.getHeight());

        //修改动物的身高 50
        an.setHeight(50);
        System.out.println("an.height:"+an.getHeight());

    }
}
