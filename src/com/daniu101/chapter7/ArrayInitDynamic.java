package com.daniu101.chapter7;

public class ArrayInitDynamic {

    public static void main(String[] args) {

        // 创建数组并分配内存
        int[] allScore = new int[10];

        // 给数组的第 0 索引赋值为99
        allScore[0] = 99;

        // 给数组的第 5 索引赋值为50
        allScore[5] = 50;

        System.out.println(allScore[0]);
        System.out.println(allScore[5]);

    }
}
