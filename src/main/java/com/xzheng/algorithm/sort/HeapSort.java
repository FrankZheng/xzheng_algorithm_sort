package com.xzheng.algorithm.sort;

/**
 * Created by zhengxiaoqiang on 17/3/8.
 */
public class HeapSort extends Sort {
    public static void sort(int[] ns) throws Exception {
        //堆排序, 把数组构造成一个二叉数(最大堆), 根最大, 然后把根和最后一个叶子节点交换
        //然后把剩余元素再重新构造
        //https://www.youtube.com/watch?v=D_B3HN4gcUA
        if (ns == null || ns.length == 0) {
            throw new IllegalArgumentException("null or empty array");
        }

        buildHeap(ns);

        for (int i = ns.length - 1 ; i >= 0 ; i--) {
            heapify(ns, 0, i);
            int temp = ns[0];
            ns[0] = ns[i];
            ns[i] = temp;
        }
    }

    static void buildHeap(int[] ns) {
        //初始化,构造最大堆
        for (int i = ns.length/2-1 ; i >= 0 ; i--) {
            heapify(ns, i, ns.length-1);
        }
    }

    static void heapify(int[] ns, int start, int end) {
        //在最大元素交换后再调整为最大堆
        int i = start;
        while(true) {
            int left = 2*i + 1;
            if (left > end) {
                break;
            }
            int right = 2*i + 2;
            int max;
            if (right > end) {
                max = left;
            } else {
                max = ns[left] > ns[right] ? left : right;
            }
            if (ns[max] > ns[i]) {
                swap(ns, max, i);
                i = max;
            } else {
                break;
            }
        }
    }
}
