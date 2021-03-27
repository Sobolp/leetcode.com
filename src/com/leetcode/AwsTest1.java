package com.leetcode;

import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class AwsTest1 {

    private TreeMap<Integer, Integer> cal = new TreeMap<>();;

    public int solution(int[] A, int[] B) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            book(A[i], B[i]);
        }
        Integer tmp_sum = 0;
        for (Integer range: cal.values()) {
            tmp_sum += range;
            if (tmp_sum == 0) {
                result++;
            }
        }
        return result;
    }

    private void book(int start, int end) {
        cal.put(start, cal.getOrDefault(start, 0) + 1);
        cal.put(end, cal.getOrDefault(end, 0) - 1);
    }
}
