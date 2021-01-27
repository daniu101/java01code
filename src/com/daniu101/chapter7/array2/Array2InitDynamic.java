package com.daniu101.chapter7.array2;

import java.util.Arrays;

public class Array2InitDynamic {

    public static void main(String[] args) {

        /*
        3:包含3个一维数组
        2:每个一维数组有 2 个元素
         */
        int[][] allScore = new int[3][2];

        //给第 1 个一维数组赋值
        allScore[0] = new int[]{90, 83};

        allScore[1] = new int[]{9, 50};
        allScore[2] = new int[]{62, 18};

        System.out.println(allScore);
        System.out.println(Arrays.toString(allScore));
        System.out.println(Arrays.toString(allScore[0]));

    }
}
