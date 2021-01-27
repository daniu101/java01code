package com.daniu101.chapter6.condition;

public class ConditionSwitch {

    public static void main(String[] args) {

        // 定义周几
        int week = 6;

        switch (week) {
            case 1:
                System.out.println("今天公司上班！");
                break;

            case 2:
                System.out.println("今天公司上班！");
                break;

            case 3:
                System.out.println("今天公司上班！");
                break;

            case 4:
                System.out.println("今天公司上班！");
                break;

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
