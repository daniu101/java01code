package com.daniu101.chapter5;

public class LogicShort2_1Operator {

    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 100;

        /*
        短路逻辑与的操作步骤：
        1：短路与，先计算左边，
                          如果左边是false，不在计算右边，直接输出最终结果 false
                          如果左边是true，计算右边，如果右边是fasle，最终结果是false
                                                如果右边是true，最终结果是true

         i++：先操作i，然后在自增
         num1++ > 100：有两个操作
         第一个：num1 > 100
         第二个：num1++ 等效于 num1 = num1+1;

         此行输出的操作：
         第一步：num1++ > 100 的2小步
         第一步的1小步：比较 num1 > 100 即 100 > 100 是false，不在进行右边的计算，最终结果是false
         第一步的2小步：num1++ 还是计算的，num1 最终是 101

         第二步：num2++ > 100 未进行任何计算，num2 还是 100

         */
        System.out.println((num1++ > 100) && (num2++ > 100));
        System.out.println(num1);
        System.out.println(num2);

    }

}
