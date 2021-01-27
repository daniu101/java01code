package com.daniu101.chapter7.note;

public class ArrayOut {

    public static void main(String[] args) {

        //静态初始化，有 0-4 索引
        int[] allScore = {90, 83, 54, 89, 93};

        //访问索引 4
        System.out.println(allScore[4]);

        //访问索引 5， 不存在
        System.out.println(allScore[5]);

    }
}
