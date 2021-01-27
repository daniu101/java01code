package com.daniu101.chapter7.method;

import java.util.Arrays;

public class ArrayCopy2 {

    public static void main(String[] args) {

        int[] allScore = {90, 83, 54, 89, 93, 54, 56, 9, 3};

        System.out.println(allScore);
        System.out.println(Arrays.toString(allScore));

        // 创建一个新数组
        int[] allScoreA = new int[allScore.length];
        System.arraycopy(allScore, 0, allScoreA, 0, allScore.length);

        System.out.println(allScoreA);
        System.out.println(Arrays.toString(allScoreA));

    }
}
