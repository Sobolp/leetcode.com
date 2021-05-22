package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        List<Integer> rest = new ArrayList<>();
        int i = 0;
        for (int a2 : arr2) {
            for (int a1 : arr1) {
                if (a1 == a2) {
                    result[i++] = a1;
                }
                ;
            }
        }
        for (Integer a1 : arr1) {
            if (!isIntInArr(a1, arr2)) {
                rest.add(a1);
            }
        }
        Collections.sort(rest);
        for (Integer r : rest) {
            result[i++] = r;
        }
        return result;
    }

    private boolean isIntInArr(int a, int[] arr) {
        for (int ar : arr) {
            if (ar == a) {
                return true;
            }
        }
        return false;
    }
}
