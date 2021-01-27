package com.daniu101.chapter6.loop;

public class LoopDoWhile {

    public static void main(String[] args) {

        int i = 0;

        do {

            System.out.println("第" + i + "个 Hello World");

            //更新循环条件
            i++;

        } while (i < 100);

    }
}
