package com.daniu101.chapter5;

public class TernaryOperator {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        // 关系表达式?表达式1:表达式2
        int ternary = a > b ? 10 : 20;

        System.out.println(ternary);

    }

}
