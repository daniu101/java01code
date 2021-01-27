package com.daniu101.chapter10.privatetest;

public class AnimalP {

    //被保护的身高
    private int height;

    //提供给其他类访问的方法
    public int getHeight() {
        return height;
    }

    //提供给其他类赋值的方法
    public void setHeight(int hg) {

        if (hg >= 0) {
            this.height = hg;
        } else {
            System.out.println("您输入的身高有误");
        }
    }

    //重写toString方法


    @Override
    public String toString() {
        return "AnimalP{" +
                "height=" + height +
                '}';
    }
}
