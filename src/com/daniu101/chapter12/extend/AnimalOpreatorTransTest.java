package com.daniu101.chapter12.extend;

//多态转型
public class AnimalOpreatorTransTest {

    public static void main(String[] args) {

        /*
        向上转型：子类到父类
         */
        Animal animal = new Dog();
        animal.run();
        //动物形态时，无法调用work方法
        // animal.work();

       /*
        向下转型：父类到子类
         */
        Dog dog = (Dog) animal;
        dog.run();
        dog.work();

    }

}
