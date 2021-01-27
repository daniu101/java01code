package com.daniu101.chapter6.condition;

public class ConditionSwitchCase {

    public static void main(String[] args) {

        // 定义周几
        int week = 6;

        switch (week) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("今天公司上班！");
                break;

            case 6:
                System.out.println("今天公司周六放假！");
                break;

            default:
                System.out.println("今天公司周日放假！");
                break;

        }

    }

}
