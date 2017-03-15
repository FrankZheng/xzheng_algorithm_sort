package com.xzheng.algorithm.binarysearch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by zhengxiaoqiang on 17/3/11.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class BinarySearchTest {

    @Test
    public void testSearch() throws Exception {
        int[] ns = new int[]{1,2,3,5,6,9,100,201};
        assertEquals(2, BinarySearch.search(ns, 3));
        assertEquals(-1, BinarySearch.search(ns, 4));
        assertEquals(-1, BinarySearch.search(ns, 250));

        ns = new int[]{1,2,3,3,3,5,6,9,100,201};
        assertEquals(4, BinarySearch.search(ns, 3));
    }

    @Test
    public void testSearchDuplicates() throws Exception {
        int[] ns = new int[]{1,2,3,3,3,5,6,9,100,201};
        assertEquals(2, BinarySearch.searchDuplicates(ns, 3, true));
        assertEquals(4, BinarySearch.searchDuplicates(ns, 3, false));

        assertEquals(-1, BinarySearch.searchDuplicates(ns, 4, true));
        assertEquals(-1, BinarySearch.searchDuplicates(ns, 250, false));
    }

    @Test
    public void testGetCount() throws Exception {
        int[] ns = new int[]{1,2,3,3,3,5,6,9,100,201};
        assertEquals(3, BinarySearch.getCount(ns, 3));
        assertEquals(1, BinarySearch.getCount(ns, 1));
        assertEquals(0, BinarySearch.getCount(ns, 250));
    }

}
