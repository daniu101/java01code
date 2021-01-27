package com.daniu101.chapter7.method;

import java.util.Arrays;

public class ArrayMerge1 {

    public static void main(String[] args) {

        int[] allScore = {90, 83, 54, 89, 93, 54, 56, 9, 3};
        int[] score100 = {100, 100, 100};

        //创建一个新数组，长度等于上面两个数组的长度和
        int[] all = new int[allScore.length + score100.length];

        //将 allScore 拷贝到 all
        System.arraycopy(allScore, 0, all, 0, allScore.length);
        //将 score100 拷贝到 all
        System.arraycopy(score100, 0, all, allScore.length, score100.length);

        //分别输出三个数组
        System.out.println(Arrays.toString(allScore));
        System.out.println(Arrays.toString(score100));
        System.out.println(Arrays.toString(all));

    }
}
