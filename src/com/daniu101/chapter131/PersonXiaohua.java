package com.daniu101.chapter131;

/*
 小花的具体实现类
 # 没有 abstract 修饰
 就是一个普通的类
 */
public class PersonXiaohua extends Person131{

    // 重写
    @Override
    public int say() {
        System.out.println("小花在说话");
        return 0;
    }

    @Override
    public void write() {
        System.out.println("小花在写字");
    }
}
