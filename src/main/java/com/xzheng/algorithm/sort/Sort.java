package com.xzheng.algorithm.sort;

/**
 * Created by zhengxiaoqiang on 17/3/8.
 */
public class Sort {
    static void swap(int[] ns, int i , int j) {
        int temp = ns[i];
        ns[i] = ns[j];
        ns[j] = temp;
    }
}
