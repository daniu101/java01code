package com.daniu101.chapter11;

// 管理类
public class Leader extends Member{

    public Leader(){
        System.out.println("我是Leader的构造方法");
    }

    //领导方法
    public void  leader(){
        System.out.println("222这里是部门经理领导功能的方法");
    }

    //决策方法
    void  dicision(){
        System.out.println("222这里是部门经理决策功能的方法");
    }

}
