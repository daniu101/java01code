package com.daniu101.chapter10.safetyproblem;

public class AnimalTest {

    public static void main(String[] args) {

        //创建一个动物对象
        Animal an = new Animal();

        System.out.println("an.height:" + an.height);

        //修改动物的身高
        an.height = 100;

        System.out.println("an.height:" + an.height);

        //修改动物的身高
        an.height = -100;

        System.out.println("an.height:" + an.height);

    }
}
