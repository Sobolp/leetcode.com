package com.leetcode.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumIceCreamBars {
    public int maxIceCream(int[] costs, int coins) {
        int result = 0;
        int budget = coins;
        Arrays.sort(costs);
        for (int cost : costs) {
            budget -= cost;
            if (budget >= 0) {
                result++;
            } else {
                break;
            }
        }
        return result;
    }
}
