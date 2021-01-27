package com.daniu101.chapter5;

public class BitMoveOperator {

    public static void main(String[] args) {

        int a = 3 >> 2;
        // 3 的二进制 0 0 1 1
        //左边移动1位 0 1 1 0  = 十进制的6
        //左边移动2位 1 1 0 0  = 十进制的12

        //右边移动1位 0 0 0 1  = 十进制的1

        //右边移动2位 0 0 0 0  = 十进制的0

        System.out.println(a);

    }

}
