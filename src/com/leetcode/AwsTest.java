package com.leetcode;

import java.util.Arrays;
import java.util.List;

public class AwsTest {
    public int solution(int N, String S) {
        List<Character> columnName = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K');
        int[][] matrix = new int[N][10];
        int result = 0;
        if (S.length() != 0) {
            List<String> occup = Arrays.asList(S.split(" "));

            for (String str : occup) {
                char[] tmp = str.toCharArray();
                int a = Integer.parseInt(String.valueOf(tmp[0])) - 1;
                int b = columnName.indexOf(tmp[1]);
                matrix[a][b] = 1;
            }
        }
        for (int i = 0; i < N; i++) {
            result += checkLine(matrix[i]);
        }

        return result;
    }

    private int checkLine(int[] line) {
        int result = 0;
        if (line[3] != 1 && line[4] != 1) {
            if ((line[1] != 1 && line[2] != 1)) {
                result = 1;
            } else if (line[5] != 1 && line[6] != 1) {
                result = 1;
            }

            if (line[5] != 1 && line[6] != 1) {
                if (line[7] != 1 && line[8] != 1) {
                    if (line[1] != 1 && line[2] != 1 && result == 1) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
