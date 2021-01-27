package com.daniu101.chapter7.method;

public class ArrayInitTraverse {

    public static void main(String[] args) {

        int[] allScore = {90, 83, 54, 89, 93, 54, 56, 9, 3};

        //使用for循环遍历每个元素
        for (int i = 0; i < allScore.length; i++) {

            System.out.println("第" + i + "个元素值：" + allScore[i]);

        }

    }
}
