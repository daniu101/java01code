package com.daniu101.chapter7.note;

public class ArrayNull {

    public static void main(String[] args) {

        // 创建数组并分配内存
        int[] allScore = new int[10];

        System.out.println(allScore[0]);

        // 释放内存
        allScore = null;

        System.out.println(allScore[0]);

    }
}
