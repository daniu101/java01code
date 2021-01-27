package com.daniu101.chapter6;

public class scope {

    public static void main(String[] args) {

        int number = 2;
        System.out.println(number);

        // 调用新增加的方法
        getMethod();

    }

    public static void getMethod() {
        int number = 4;
        System.out.println(number);
    }

}
