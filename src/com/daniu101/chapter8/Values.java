package com.daniu101.chapter8;

public class Values {

    public static void main(String[] args) {

        ColorEnums[] values = ColorEnums.values();

        for (ColorEnums v : values) {
            System.out.println(v.name() + " " + v.ordinal());
        }

    }
}
