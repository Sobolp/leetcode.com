package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNonDuplicateTest {

    SingleNonDuplicate singleNonDuplicate = new SingleNonDuplicate();
    @Test
    void singleNonDuplicateTest() {
        /**
         * Example 1:
         *
         * Input: nums = [1,1,2,3,3,4,4,8,8]
         * Output: 2
         */
        assertEquals(2,singleNonDuplicate.singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));

        /**
         * Example 2:
         *
         * Input: nums = [3,3,7,7,10,11,11]
         * Output: 10
         */
        assertEquals(10,singleNonDuplicate.singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));

        /**
         * Input: nums = [1]
         * Output: 1
         */
        assertEquals(1,singleNonDuplicate.singleNonDuplicate(new int[]{1}));
    }
}