package com.leetcode.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class MaximumIceCreamBars {
    public int maxIceCream(int[] costs, int coins) {
        int result = 0;
        int budget = coins;
        Map<Integer, Integer> priceMap = new HashMap<>();
        for (int cost : costs) {
            priceMap.put(cost, (priceMap.getOrDefault(cost, 0)) + 1);
        }
        for (Integer price : priceMap.keySet().stream().sorted().collect(Collectors.toList())) {
            for (int i = 0; i < priceMap.get(price); i++) {
                budget -= price;
                if (budget >= 0) {
                    result++;
                } else {
                    return result;
                }
            }
        }
//        Arrays.sort(costs);
//        for (int cost : costs) {
//            budget -= cost;
//            if (budget >= 0) {
//                result++;
//            } else {
//                break;
//            }
//        }
        return result;
    }
}
