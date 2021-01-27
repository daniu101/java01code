package com.daniu101.chapter5;

public class LogicShortOperator {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        // 逻辑与
        System.out.println(a & b);
        // 短路逻辑与
        System.out.println(a && b);

        // 逻辑或
        System.out.println(a | b);
        // 短路逻辑或
        System.out.println(a || b);

    }

}
