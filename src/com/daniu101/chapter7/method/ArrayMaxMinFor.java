package com.daniu101.chapter7.method;

public class ArrayMaxMinFor {

    public static void main(String[] args) {

        int[] numbers = {18, 52, 77, 15, 444, 569, 545};

        //假定第一个元素即使最大值、也是最小值
        int max = numbers[0];
        int min = numbers[0];

        //将 max 与其它元素进行比较，若其它元素更大，则替换
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        //将 min 与其它元素进行比较，若其它元素更小，则替换
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);

    }
}
