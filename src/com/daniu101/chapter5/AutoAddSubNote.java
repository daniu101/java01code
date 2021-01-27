package com.daniu101.chapter5;

public class AutoAddSubNote {

    public static void main(String[] args) {

        int it = 100;

        // 操作顺序：先赋值，后自增
        int tj = it++;

        System.out.println("it:" + it);
        System.out.println("tj:" + tj);

        int itt = 10;

        // 操作顺序：先自增，后赋值
        int ittj = ++itt;

        System.out.println("itt:" + itt);
        System.out.println("ittj:" + ittj);

    }

}
