package com.daniu101.chapter121.extend;

// 转型
public class Dog121Test{

    public static void main(String[] args) {

        //上
        Animal121 animal121 = new Dog121();
        animal121.eat();
        animal121.run();
        //animal121.work();

        //下
        Dog121 dog121 = (Dog121) animal121;
        dog121.work();

    }

}
