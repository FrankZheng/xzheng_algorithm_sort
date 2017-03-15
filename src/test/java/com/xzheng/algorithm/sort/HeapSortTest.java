package com.xzheng.algorithm.sort;

import com.xzheng.algorithm.BaseTestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.Arrays;

/**
 * Created by zhengxiaoqiang on 17/3/8.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class HeapSortTest extends BaseTestCase {

    @Test
    public void testSort() throws Exception {
        int[] ns = {100,50,80,20,55,99,0,-1,-10};
        HeapSort.sort(ns);
        assertArrayEquals(Arrays.asList(-10,-1,0,20,50,55,80,99,100),ns);
    }

    @Test
    public void testHeapify() throws Exception {
        int[] ns = {1,5,4,2,3};
        HeapSort.heapify(ns, 0, ns.length-1);
        assertArrayEquals(Arrays.asList(5,3,4,2,1), ns);

        ns = new int[]{1,5,4,2};
        HeapSort.heapify(ns, 0, ns.length-1);
        assertArrayEquals(Arrays.asList(5,2,4,1), ns);

        ns = new int[]{1,7,8,6,5,3,2};
        HeapSort.heapify(ns, 0, ns.length-1);
        assertArrayEquals(Arrays.asList(8,7,3,6,5,1,2), ns);

    }

    @Test
    public void testBuildHeap() throws Exception {
        int[] ns = {1,3,2,4,5,6};
        HeapSort.buildHeap(ns);
        assertArrayEquals(Arrays.asList(6,5,2,4,3,1), ns);


        ns = new int[]{100,1,2,-1};
        HeapSort.buildHeap(ns);
        assertArrayEquals(Arrays.asList(100,1,2,-1), ns);



    }
}
