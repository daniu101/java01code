package com.daniu101.chapter7;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayUtilsTest {

    public static void main(String[] args) {

        //静态初始化一个数组
        int[] allScore = {90, 83, 54, 89, 93};

        //将一个数组转换成String
        System.out.println(ArrayUtils.toString(allScore));

        /*
        判断两个数组是否相等
        方法过时
         */
        int[] allScore1 = {91, 83, 54, 89, 93};
        System.out.println(ArrayUtils.isEquals(allScore, allScore1));

        //拷贝数组
        int[] allScoreClone = ArrayUtils.clone(allScore);
        System.out.println(allScore);
        System.out.println(allScoreClone);

        //截取子数组
        int[] allScoreSub = ArrayUtils.subarray(allScore, 1, 2);
        System.out.println(ArrayUtils.toString(allScoreSub));

        //判断两个数组长度是否相等
        System.out.println(ArrayUtils.isSameLength(allScore, allScore1));

        //获得数组的长度
        System.out.println(ArrayUtils.getLength(allScore));

        //判段两个数组的类型是否相同
        System.out.println(ArrayUtils.isSameType(allScore, allScore1));

        //数组反转
        ArrayUtils.reverse(allScore);
        System.out.println(ArrayUtils.toString(allScore));

        //查询某个Object在数组中的位置
        System.out.println(ArrayUtils.indexesOf(allScore, 89));

        //反向查询某个Object在数组中的位置
        System.out.println(ArrayUtils.lastIndexOf(allScore, 89));

        //查询某个Object是否在数组中
        System.out.println(ArrayUtils.contains(allScore, 90));

        //判断数组是否为空
        System.out.println(ArrayUtils.isEmpty(allScore));

        //合并两个数组
        int[] allScoreAddAll = ArrayUtils.addAll(allScore, allScore1);
        System.out.println(ArrayUtils.toString(allScoreAddAll));

        //添加一个数据到数组
        int[] allScoreAddAll1 = ArrayUtils.add(allScoreAddAll, 100);
        System.out.println(ArrayUtils.toString(allScoreAddAll1));

        //删除数组中某个位置上的数据
        int[] allScoreAddAllR = ArrayUtils.remove(allScoreAddAll1, 0);
        System.out.println(ArrayUtils.toString(allScoreAddAllR));

        //删除数组中某个对象
        int[] allScoreAddAllRe = ArrayUtils.removeElement(allScoreAddAllR, 83);
        System.out.println(ArrayUtils.toString(allScoreAddAllRe));

    }
}
