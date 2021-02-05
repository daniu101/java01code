package com.daniu101.chapter13;

// 测试类
public class PersonTest {

    public static void main(String[] args) {

        //创建小明对象
        System.out.println("++++++++++++++小明对象");
        Xiaoming xiaoming = new Xiaoming();
        xiaoming.say();
        xiaoming.writing();


        //以多态的形式 创建小明对象
        System.out.println("++++++++++++++多态的小明对象");
        Persion persionXiaoming = new Xiaoming();
        persionXiaoming.say();
        persionXiaoming.writing();

        //创建小花对象
        System.out.println("++++++++++++++小花对象");
        Xiaohua xiaohua = new Xiaohua();
        xiaohua.say();
        xiaohua.writing();

        //创建小张对象
        System.out.println("++++++++++++++小张对象");
        Xiaozhang xiaozhang = new Xiaozhang();
        xiaozhang.say();
        xiaozhang.writing();

    }

}
