package com.daniu101.chapter131;

/*
 测试类
 */
public abstract class Person131Test {

    public static void main(String[] args) {

        // 多态
        Person131 person131 = new PersonXiaoming();
        person131.say();
        person131.write();

        /*
         ！常用！
         普通使用
         */
        PersonXiaoming personXiaoming = new PersonXiaoming();
        personXiaoming.say();
        personXiaoming.write();

    }
}
