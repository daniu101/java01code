package com.daniu101.chapter7.array2;

public class Array2For {

    public static void main(String[] args) {

        //静态初始化一个二维数组，不规则的矩阵
        int[][] int2 = {{1, 2}, {2, 3, 4}, {3, 4, 5, 6}};

        // 普通for循环
        System.out.println("普通for循环：");
        for (int i = 0; i < int2.length; i++) { //0,1,2

            //进入了一维数组

            for (int j = 0; j < int2[i].length; j++) {

                //打印出一维数组的每个元素
                System.out.print(int2[i][j] + "\t");
            }

            //每打印完一个 一维数组 换行
            System.out.println();
        }

        // 增强for循环
        System.out.println("增强for循环：");
        for (int[] arr : int2) {
            //迭代的变量是一个 一维数组

            for (int i : arr) {
                //迭代的变量是 一维数组 中的 int 值
                System.out.print(i + "\t");
            }

            //每打印完一个 一维数组 换行
            System.out.println();
        }

    }
}
