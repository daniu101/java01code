package com.daniu101.chapter12.extend;

//动物操作类 测试
public class AnimalOpreatorTest2 {

    public static void main(String[] args) {

        //创建动物操作类
        AnimalOpreator2 animalOpreator2 = new AnimalOpreator2();

        animalOpreator2.useMethod(new Dog());

        animalOpreator2.useMethod(new Cat());

    }

}
