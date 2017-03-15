package com.xzheng.algorithm.sort;

/**
 * Created by zhengxiaoqiang on 17/3/8.
 */
public class QuickSort extends Sort {
    public static void sort(int[] n) throws IllegalArgumentException {
        if (n == null || n.length == 0) {
            throw new IllegalArgumentException("null or empty n");
        }

        quickSort(n, 0, n.length-1);


    }

    static void quickSort(int[] n, int start, int end) {
        if (start < end) {
            int pIndex = partition(n, start, end);
            quickSort(n, start, pIndex-1);
            quickSort(n, pIndex+1, end);
        }
    }

    static int partition(int[] n, int start, int end) {
        int pivot = n[end];
        int pIndex = start;
        for (int i = start ; i < end ; i++) {
            if (n[i] <= pivot) {
                swap(n, i, pIndex);
                pIndex++;
            }
        }
        swap(n, pIndex, end);
        return pIndex;
    }

}
