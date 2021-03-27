package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AwsTest1Test {

    AwsTest1 inst = new AwsTest1();

    @Test
    void solutionTest() {
        /**
         * ([1, 12, 42, 70, 36, -4, 43, 15], [5, 15, 44, 72, 36, 2, 69, 24])
         * 5
         */

        assertEquals(5, inst.solution(new int[]{1, 12, 42, 70, 36, -4, 43, 15},new int[]{5, 15, 44, 72, 36, 2, 69, 24}));
    }
}