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
public class BubbleSortTest extends BaseTestCase {
    @Test
    public void testSort() throws Exception {
        int[] ns = {100,50,80,20,55,99,0,-1,-10};
        BubbleSort.sort(ns);
        assertArrayEquals(Arrays.asList(-10,-1,0,20,50,55,80,99,100),ns);
    }
}
