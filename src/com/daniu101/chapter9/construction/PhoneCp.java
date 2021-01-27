package com.daniu101.chapter9.construction;

//手机的描述类
public class PhoneCp {

    String brand = "Apple";
    String name = "iPhone 12 Pro Max";
    float size = 6.7F;
    boolean state = true;

    //带参构造方法，接收参数
    public PhoneCp(String brand){
        System.out.println("调用带参构造方法");

        //一般作用，给属性初始化值
        this.brand= brand;
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

