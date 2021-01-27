package com.daniu101.chapter9.construction;

//手机的描述类
public class PhoneC {

    String brand = "Apple";
    String name = "iPhone 12 Pro Max";
    float size = 6.7F;
    boolean state = true;

    //无参构造方法，没有接收参数
    public PhoneC(){
        System.out.println("调用无参构造方法");

        //一般作用，给属性初始化值
        this.brand= "Xiaomi";
        this.name = "Xiaomi 11";
    }

    //打电话方法
    public void call() {

        System.out.println("打电话");
    }

    //上网方法
    public void network() {
        System.out.println("浏览网络信息");
    }

}

