package com.daniu101.chapter131;

/*
 测试类
 */
public class Person131ImplTest {

    public static void main(String[] args) {

        Person131Impl person131 = new Person131Impl();
        person131.say();
        person131.write();
        person131.work();

        // 所有子类都有的一个方法，且子类无需重写实现
        person131.write2();

        // 对象版本、对象常量
        String nameProject = person131.NAME_PROJECT;
        System.out.println(nameProject);

    }

}
