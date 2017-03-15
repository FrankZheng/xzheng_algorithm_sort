package com.xzheng.algorithm.sort;

import com.xzheng.algorithm.BaseTestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.Arrays;

/**
 * Created by zhengxiaoqiang on 17/3/7.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class InsertSortTest extends BaseTestCase {


    @Test
    public void testInsertSort() throws Exception {
        int[] ns = {100,1,2,-1};
        InsertSort.sort(ns);
        assertArrayEquals(Arrays.asList(-1,1,2,100), ns);

    }


}
