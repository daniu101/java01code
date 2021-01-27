package com.daniu101.chapter9;

//手机的描述类
public class Phone {

    String brand = "Apple";
    String name = "iPhone 12 Pro Max";
    float size = 6.7F;
    boolean state = true;

    //打电话方法
    public void call() {

        System.out.println("打电话");
    }

    //上网方法
    public void network() {
        System.out.println("浏览网络信息");
    }

}

