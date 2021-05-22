package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumIceCreamBarsTest {

    private MaximumIceCreamBars subjectClass = new MaximumIceCreamBars();

    @Test
    void maxIceCreamTest() {
        /**
         * Example 1:
         *
         * Input: costs = [1,3,2,4,1], coins = 7
         * Output: 4
         * Explanation: The boy can buy ice cream bars at indices 0,1,2,4 for a total price of 1 + 3 + 2 + 1 = 7.
         */
        assertEquals(4, subjectClass.maxIceCream(new int[]{1,3,2,4,1}, 7));

        /**
         * Example 2:
         *
         * Input: costs = [10,6,8,7,7,8], coins = 5
         * Output: 0
         * Explanation: The boy cannot afford any of the ice cream bars.
         */
        assertEquals(0, subjectClass.maxIceCream(new int[]{10,6,8,7,7,8}, 5));

        /**
         * Example 3:
         *
         * Input: costs = [1,6,3,1,2,5], coins = 20
         * Output: 6
         * Explanation: The boy can buy all the ice cream bars for a total price of 1 + 6 + 3 + 1 + 2 + 5 = 18.
         */
        assertEquals(6, subjectClass.maxIceCream(new int[]{1,6,3,1,2,5}, 20));

    }
}