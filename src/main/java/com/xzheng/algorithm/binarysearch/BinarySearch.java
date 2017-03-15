package com.xzheng.algorithm.binarysearch;

/**
 * Created by zhengxiaoqiang on 17/3/11.
 */
public class BinarySearch {

    public static int search(int[] ns, int value) throws IllegalArgumentException {
        if (ns == null || ns.length == 0) {
            throw new IllegalArgumentException("null or empty ns");
        }
        int low = 0;
        int high = ns.length-1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (value == ns[mid]) {
                return mid;
            } else if(value > ns[mid]) {
                low = mid+1;
            } else if (value < ns[mid]) {
                high = mid-1;
            }
        }
        return -1;
    }

    /*
     * 用二元查找进行搜索, 如果有重复的数, 返回第一个的索引, 或者最好一个索引
     */
    public static int searchDuplicates(int[] ns, int value, boolean searchFirst) throws IllegalArgumentException {
        if (ns == null || ns.length == 0) {
            throw new IllegalArgumentException("null or empty ns");
        }
        int low = 0;
        int high = ns.length-1;
        int result = -1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (value == ns[mid]) {
                result = mid;
                if (searchFirst) {
                    high = mid-1;
                } else {
                    low = mid+1;
                }
            } else if(value > ns[mid]) {
                low = mid+1;
            } else if (value < ns[mid]) {
                high = mid-1;
            }
        }
        return result;
    }

    public static int getCount(int[] ns, int value) throws IllegalArgumentException {
        if (ns == null || ns.length == 0) {
            throw new IllegalArgumentException("null or empty ns");
        }
        int firstIdx = searchDuplicates(ns, value, true);
        if (firstIdx == -1) {
            return 0;
        }
        int lastIdx = searchDuplicates(ns, value, false);
        return lastIdx - firstIdx + 1;
    }
}
