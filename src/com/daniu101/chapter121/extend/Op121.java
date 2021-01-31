package com.daniu101.chapter121.extend;

// 动物的操作类
public class Op121 {

    // 父类作为参数
    void useAnimal(Animal121 animal121){
        animal121.run();
        animal121.eat();

        //多态不能访问子类的特有方法
        //animal121.work();
    }

}
