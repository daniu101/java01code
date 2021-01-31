package com.daniu101.chapter12.extend;

// 动物操作类，使用了重载
public class AnimalOpreator {

    //狗的操作方法
    public void useMethod(Dog dog) {
        dog.run();
        //狗的特有方法
        dog.work();
    }

    /*
    方法重载
    猫的操作方法
     */
    public void useMethod(Cat cat) {
        cat.run();
    }

}
