package com.xzheng.algorithm.leetcode.array;

import java.util.Arrays;

/**
 * Created by zhengxiaoqiang on 17/3/15.
 */
public class RemoveElement {
    //https://siddontang.gitbooks.io/leetcode-solution/content/array/remove_element.html
    /*
    Given an array and a value, remove all instances of that > value in place and return the new length.
    The order of elements can be changed. It doesn't matter what you leave beyond the new length.
     */

    public static int removeElement(int[] ns, int value) throws IllegalArgumentException {
        if (ns == null || ns.length == 0) {
            throw new IllegalArgumentException("null or empty ns");
        }
        int i = 0;
        int j = 0;
        for ( ; i < ns.length && j < ns.length; i++, j++) {
            while (ns[j] == value) {
                j++;
            }
            if (i != j ){
                ns[i] = ns[j];
            }

        }
        return i;
    }



}
