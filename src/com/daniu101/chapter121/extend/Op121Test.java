package com.daniu101.chapter121.extend;

// 动物的操作类的测试类
public class Op121Test {

    public static void main(String[] args) {

        Op121 op121 = new Op121();

        Cat121 cat121 = new Cat121();
        op121.useAnimal(cat121);

        Dog121 dog121 = new Dog121();
        op121.useAnimal(dog121);

        Jack121 jack121 = new Jack121();
        op121.useAnimal(jack121);
    }
}
