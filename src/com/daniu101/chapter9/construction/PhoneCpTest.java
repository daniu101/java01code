package com.daniu101.chapter9.construction;

public class PhoneCpTest {

    public static void main(String[] args) {

        //创建一个phone对象
        PhoneCp phone = new PhoneCp("Huawei");

        System.out.println("品牌:"+phone.brand);
        System.out.println("名称:"+phone.name);
        System.out.println("屏幕尺寸:"+phone.size);
        System.out.println("状态:"+phone.state);
    }
}

