package com.daniu101.chapter9;

public class PhoneTest {

    public static void main(String[] args) {

        //创建一个phone对象
        Phone phone = new Phone();

        System.out.println("品牌:"+phone.brand);
        System.out.println("名称:"+phone.name);
        System.out.println("屏幕尺寸:"+phone.size);
        System.out.println("状态:"+phone.state);

        //调用计打电话方法
        phone.call();

        //调用上网方法
        phone.network();

    }
}

