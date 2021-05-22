package com.leetcode.arrays;

public class SingleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (prev != nums[i]) {
                if (i % 2 == 0) {
                    prev = nums[i];
                } else {
                    break;
                }
            }
        }
        return prev;
    }

}
