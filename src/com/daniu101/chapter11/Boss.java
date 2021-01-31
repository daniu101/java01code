package com.daniu101.chapter11;

// 老板类
public class Boss extends Leader {

    /*
    public 类名(){
        // TODO 代码
    }
     */

    public Boss(String name) {
        System.out.println("我是Boss的构造方法");
        super.setName(name);
    }

    //发工资的方法 小驼峰方法命名
    void pay() {
        //需求：打印出老板的名字
        System.out.println("老板：" + super.getName());
        System.out.println("这里是老板发工资功能的方法");
    }

    //第二种发工资方法
    void pay(int all) {
        System.out.println("发工资了，总共：" + all);
    }

    //第二种发工资方法
    void pay(int all, int staffs) {
        System.out.println("发工资了，总共：" + all + "元，有" + staffs + "个员工");
    }

}
