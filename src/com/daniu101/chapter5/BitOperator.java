package com.daniu101.chapter5;

public class BitOperator {

    public static void main(String[] args) {

        int a = 3; //二进制 0 0 1 1
        int b = 6; //二进制 0 1 1 0

        //进行与运算，二进制 0 0 1 0 = 十进制的 2
        int result = a & b;
        System.out.println(result);

    }

}
