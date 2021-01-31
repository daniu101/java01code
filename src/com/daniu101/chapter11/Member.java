package com.daniu101.chapter11;

// 成员类
public class Member {

    // 字段
    private String name;
    private String number;

    //构造方法
    public Member(){
        System.out.println("我是Member的构造方法");
    }

    //工作方法
    void  work(){
        System.out.println("这里是员工111111111");
    }

    //get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {

        if ("".equals(name.trim())){
            System.out.println("员工姓名不能为空");
        } else {
            this.name = name;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {

        if ("".equals(number.trim())){
            System.out.println("员工编号不能为空");
        } else {
            this.number = number;
        }


    }
}
