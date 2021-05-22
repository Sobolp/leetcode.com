package com.leetcode.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumIceCreamBars {
    public int maxIceCream(int[] costs, int coins) {
        Integer result = 0;
        Integer budget = coins;
        List<Integer> priceList = Arrays.stream(costs)
                .boxed()
                .sorted()
                .collect(Collectors.toList());
        for (Integer cost : priceList) {
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
