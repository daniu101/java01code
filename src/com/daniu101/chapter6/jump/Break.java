package com.daniu101.chapter6.jump;

public class Break {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println("第" + i + "次执行循环体");

            if (i == 5) {
                //当 i == 5时，终止整个循环
                break;
            }

        }

    }
}
