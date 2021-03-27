package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodilityDemoTest {

    CodilityDemo codilityDemo = new CodilityDemo();
    int[] testArr;
    @Test
    void solutionTest() {
        /**
         *  given A = [1, 3, 6, 4, 1, 2], the function should return 5
         */
        testArr = new int[]{1, 3, 6, 4, 1, 2};
        assertEquals(5, codilityDemo.solution(testArr));

        /**
         *  Given A = [1, 2, 3], the function should return 4
         */
        testArr = new int[]{1, 2, 3};
        assertEquals(4, codilityDemo.solution(testArr));

        /**
         *  Given A = [−1, −3], the function should return 1.
         */
        testArr = new int[]{ -1, -3};
        assertEquals(1, codilityDemo.solution(testArr));
    }

}
