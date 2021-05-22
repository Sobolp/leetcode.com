package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelativeSortArrayTest {
    RelativeSortArray relativeSortArray = new RelativeSortArray();
    @Test
    void relativeSortArray() {
        /**
         * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
         * Output: [2,2,2,1,4,3,3,9,6,7,19]
         */
        assertArrayEquals(new int[]{2,2,2,1,4,3,3,9,6,7,19},
            relativeSortArray.relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19},
                    new int[]{2,1,4,3,9,6}));

        /**
         * Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
         * Output: [22,28,8,6,17,44]
         */
        assertArrayEquals(new int[]{22,28,8,6,17,44},
                relativeSortArray.relativeSortArray(new int[]{28,6,22,8,44,17},
                        new int[]{22,28,8,6}));
    }
}