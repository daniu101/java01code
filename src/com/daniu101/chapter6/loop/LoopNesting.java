package com.daniu101.chapter6.loop;

public class LoopNesting {

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            //外循环

            for (int j = 0; j < 5; j++) {
                //内循环

                System.out.println("第" + i + "次外循环，" + "第" + j + "次内循环！");

            }

        }

    }

}
