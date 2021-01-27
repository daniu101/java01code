package com.chapter4;

public class AutoConversion {

    public static void main(String[] args) {

        int number = 10;

        /*
         int 的数据范围小
         double 的数据范围大
         此时进行的是自动转换
         */
        double db = number;

        System.out.println(db);

    }

}
