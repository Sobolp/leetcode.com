package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @org.junit.jupiter.api.Test
    void twoSumTest() {
        TwoSum solution = new TwoSum();
        assertArrayEquals(new int[]{0,1}, solution.twoSum (new int[]{2,7,11,15}, 9));
        assertArrayEquals(new int[]{1,2}, solution.twoSum (new int[]{3,2,4}, 6));
        assertArrayEquals(new int[]{0,1}, solution.twoSum (new int[]{3,3}, 6));
    }
}