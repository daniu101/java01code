package com.daniu101.chapter7.method;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        int[] allScore = {90, 83, 54, 89, 93, 54, 56, 9, 3};

        System.out.println(Arrays.toString(allScore));

        // 创建一个新数组
        int[] allScoreA;
        allScoreA = allScore;

        System.out.println(Arrays.toString(allScoreA));

    }
}
