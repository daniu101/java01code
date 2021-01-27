package com.daniu101.chapter7.method;

public class ArrayCopyAddress {

    public static void main(String[] args) {

        int[] allScore = {90, 83, 54, 89, 93, 54, 56, 9, 3};

        System.out.println(allScore);

        // 创建一个新数组
        int[] allScoreA;
        allScoreA = allScore;

        System.out.println(allScore);

    }
}
