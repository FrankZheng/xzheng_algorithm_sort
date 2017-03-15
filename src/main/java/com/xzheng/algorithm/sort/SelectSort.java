package com.xzheng.algorithm.sort;

/**
 * Created by zhengxiaoqiang on 17/3/7.
 */
public class SelectSort extends Sort {
    public static void sort(int[] ns) throws IllegalArgumentException {
        if (ns == null || ns.length == 0) {
            throw new IllegalArgumentException("null or empty array");
        }

        //选择排序, 依次找到最小的值, 插入到前面(和最前面的值交换)
        for (int i = 0 ; i < ns.length ; i++) {
            //find the min
            int minIdx = i;
            for (int j = i; j < ns.length ; j++) {
                if (ns[j] < ns[minIdx]) {
                    minIdx = j;
                }
            }
            //swap the min
            swap(ns, i, minIdx);
        }
    }

    public static void sort2(int[] ns) throws IllegalArgumentException {
        if (ns == null || ns.length == 0) {
            throw new IllegalArgumentException("null or empty array");
        }
        //选择排序, 依次找到最大值, 插入到后面(和最后面的值交换)
        for (int i = ns.length -1 ; i >= 0 ; i--) {
            int maxIdx = i;
            for (int j = 0 ; j <= i ; j++) {
                if (ns[j] > ns[maxIdx]) {
                    maxIdx = j;
                }
            }
            swap(ns, i, maxIdx);
        }
    }
}
