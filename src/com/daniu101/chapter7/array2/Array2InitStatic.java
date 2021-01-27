package com.daniu101.chapter7.array2;

import java.util.Arrays;

public class Array2InitStatic {

    public static void main(String[] args) {

        //静态初始化一个二维数组，不规则的矩阵
        int[][] int2 = {{1, 2}, {2, 3, 4}, {3, 4, 5, 6}};

        System.out.println(int2);
        System.out.println(Arrays.toString(int2));
        System.out.println(Arrays.toString(int2[1]));

    }
}
