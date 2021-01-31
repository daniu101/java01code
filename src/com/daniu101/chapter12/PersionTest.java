package com.daniu101.chapter12;

// 多态演示
public class PersionTest {

    public static void main(String[] args) {

        //小明 第 1 种形态
        System.out.println("小明 第 1 种形态");
        Persion p = new XiaoMing();
        p.say();
        p.write();

        //小明 第 2 种形态
        System.out.println("小明 第 2 种形态");
        XiaoMing xm = new XiaoMing();
        xm.say();
        xm.write();

        //小花 第 1 种形态
        System.out.println("小花 第 1 种形态");
        Persion p2 = new XiaoHua();
        p2.say();
        p2.write();

        //小花 第 2 种形态
        System.out.println("小花 第 2 种形态");
        XiaoHua xh = new XiaoHua();
        xh.say();
        xh.write();


    }
}
