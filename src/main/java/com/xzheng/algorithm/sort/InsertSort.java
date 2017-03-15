package com.xzheng.algorithm.sort;


/**
 * Created by zhengxiaoqiang on 17/3/7.
 */
public class InsertSort extends Sort {

    public static void sort(int[] ns) throws IllegalArgumentException {
        if (ns == null || ns.length == 0) {
            throw new IllegalArgumentException("null or empty array");
        }

        //插入排序
        //左边当成一个有序区, 从右边开始往里面里面插入(其实是交换)
        for(int i = 1 ; i < ns.length ; i++) {
            for (int j = i; j >=1 ; j--) {
                if (ns[j] < ns[j-1]) {
                    swap(ns, j, j-1);
                }
            }
        }
    }








}
