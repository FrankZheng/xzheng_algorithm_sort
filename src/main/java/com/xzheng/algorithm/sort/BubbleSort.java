package com.xzheng.algorithm.sort;

/**
 * Created by zhengxiaoqiang on 17/3/8.
 */
public class BubbleSort extends Sort {
    public static void sort(int[] ns) throws IllegalArgumentException {
        if (ns == null || ns.length == 0) {
            throw new IllegalArgumentException("null or empty ns");
        }

        //冒泡排序 从最后一个开始遍历, 每次把小的数和之前的进行交换, 让小的数朝左边运动
        for (int i = 0 ; i < ns.length ; i++) {
            for (int j = ns.length-1; j > i; j--) {
                if (ns[j] < ns[j-1]) {
                    swap(ns, j, j-1);
                }
            }
        }
    }
}
