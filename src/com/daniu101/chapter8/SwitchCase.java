package com.daniu101.chapter8;

public class SwitchCase {

    public static void main(String[] args) {

        //定义枚举
        ColorEnums color = ColorEnums.RED;

        switch (color) {
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            default:
                System.out.println("没有颜色");
                break;

        }

    }

}
