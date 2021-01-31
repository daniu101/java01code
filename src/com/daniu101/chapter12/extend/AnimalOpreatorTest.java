package com.daniu101.chapter12.extend;

// 使用重载时的测试类
public class AnimalOpreatorTest {

    public static void main(String[] args) {

        //创建动物操作类
        AnimalOpreator animalOpreator = new AnimalOpreator();

        animalOpreator.useMethod(new Dog());

        animalOpreator.useMethod(new Cat());

    }

}
