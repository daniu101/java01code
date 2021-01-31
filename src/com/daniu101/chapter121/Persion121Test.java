package com.daniu101.chapter121;

// 测试
public class Persion121Test {

    public static void main(String[] args) {


        System.out.println("1**************");
        // 正常类创建对象，只不过类使用了继承
        Xiaoming121 xiaoming121 = new Xiaoming121();
        xiaoming121.say();
        xiaoming121.write();

        //父类 变量=new的是子类构造器
        System.out.println("2**************");
        // 多态吗？是
        Persion121 persion121 = new Xiaoming121();
        persion121.say();
        persion121.write();
        /*
        为何 小明的说话方法 而不是 人的说话方法 ？
        有重写
         */

        System.out.println("3**************");
        // 正常类创建对象，只不过类使用了继承
        Xiaohua121 xiaohua121 = new Xiaohua121();
        xiaohua121.say();
        xiaohua121.write();

        System.out.println("4**************");
        // 多态吗？是
        Persion121 persion1212 = new Xiaohua121();
        persion1212.say();
        persion1212.write();

        /*
        new 谁，用谁的方法，没有时找父类
         */

    }
}
