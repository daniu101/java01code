package com.daniu101.chapter9.method;

//手机的描述类
public class PhoneM {

    String brand = "Apple";
    String name = "iPhone 12 Pro Max";
    float size = 6.7F;
    boolean state = true;

    //修改后的打电话方法
    public void call(int count) {

        for (int i = 0; i < count; i++) {
            System.out.println("打第"+i+"次电话");
        }

    }

    //上网方法
    public void network() {
        System.out.println("浏览网络信息");
    }

}

