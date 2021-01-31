package com.daniu101.chapter12.extend;

// 动物操作类，传入父类作为参数
public class AnimalOpreator2 {

    //这样更加简洁，只写一个方法
    public void useMethod(Animal animal) {
        animal.run();

        //但是，无法调用子类特有的方法
        //animal.work();
    }

}