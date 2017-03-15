package com.xzheng.algorithm.leetcode.array;

import com.xzheng.algorithm.BaseTestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by zhengxiaoqiang on 17/3/15.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class RemoveElementTest extends BaseTestCase {
    @Test
    public void testRemoveElement() throws Exception {
        int[] ns = new int[]{1,2,3,4,5};
        assertEquals(4, RemoveElement.removeElement(ns, 2));
        assertArrayEquals(Arrays.asList(1,3,4,5,5), ns);

        ns = new int[]{1,2,3,4,5};
        assertEquals(5, RemoveElement.removeElement(ns, 100));
        assertArrayEquals(Arrays.asList(1,2,3,4,5), ns);

        ns = new int[]{1,2,2,4,5};
        assertEquals(3, RemoveElement.removeElement(ns, 2));
        assertArrayEquals(Arrays.asList(1,4,5,4,5), ns);


    }
}
