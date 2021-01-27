package com.daniu101.chapter5;

public class OperatorPriority {

    public static void main(String[] args) {

        int m = 10;
        int n = 100;

        // false && true
        boolean tag1 = m > n && m < n;
        System.out.println("tag1：" + tag1);

        /*
        false && true
        可以养成使用小括号的习惯，这样更加直观理解
         */
        boolean tag2 = (m > n) && (m < n);
        System.out.println("tag2：" + tag2);

    }

}
