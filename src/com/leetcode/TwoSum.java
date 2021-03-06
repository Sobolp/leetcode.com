package com.leetcode;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int tmp_num = nums[i];
            for(int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (target - nums[i] == nums[j]) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[] {0,0};
    }
}
