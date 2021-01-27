package com.chapter4;

public class ForcedConversion {

    public static void main(String[] args) {

        double number = 10.456;
        System.out.println(number);

        /*
         int 的数据范围小
         double 的数据范围大
         此时进行的是强制转换
         */
        int it = (int) number;

        System.out.println(it);

    }

}
