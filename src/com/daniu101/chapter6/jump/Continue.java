package com.daniu101.chapter6.jump;

public class Continue {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                //当i为偶数时，跳过，继续下一次循环
                continue;
            }

            System.out.println("第" + i + "次执行循环体");

        }

    }
}
