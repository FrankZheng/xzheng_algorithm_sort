package com.xzheng.algorithm.sort;


import com.xzheng.algorithm.BaseTestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhengxiaoqiang on 17/3/8.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class QuickSortTest extends BaseTestCase {
    @Test
    public void testSort() throws Exception {

    }

    @Test
    public void testPartition() throws Exception {
        int[] n = new int[]{7,2,1,6,8,5,3,4};
        int pIndex = QuickSort.partition(n, 0, n.length-1);
        assertEquals(3,pIndex);
        assertArrayEquals(Arrays.asList(2,1,3,4,8,5,7,6), n);
    }
}
