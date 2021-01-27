package com.daniu101.chapter7.method;

import java.util.Arrays;

public class ArrayMaxMinArrays {

    public static void main(String[] args) {

        int[] numbers = {18, 52, 77, 15, 444, 569, 545};

        //升序排序
        Arrays.sort(numbers);

        System.out.println("最大值：" + numbers[numbers.length - 1]);
        System.out.println("最小值：" + numbers[0]);

    }
}
