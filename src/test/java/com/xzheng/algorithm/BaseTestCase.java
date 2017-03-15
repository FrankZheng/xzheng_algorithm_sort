package com.xzheng.algorithm;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhengxiaoqiang on 17/3/7.
 */
public class BaseTestCase {

    protected void assertArrayEquals(List<Integer> a, int[] n) {
        ArrayList<Integer> a1 = new ArrayList<>(n.length);
        for (int i = 0 ; i < n.length ; i++) {
            a1.add(n[i]);
        }
        assertEquals(a, a1);
    }
}
