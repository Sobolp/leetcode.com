package com.leetcode;

import java.util.HashMap;

/**
 * Given a string s, return the maximum number of ocurrences of any substring under the following rules:
 * <p>
 * The number of unique characters in the substring must be less than or equal to maxLetters.
 * The substring size must be between minSize and maxSize inclusive.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "aababcaab", maxLetters = 2, minSize = 3, maxSize = 4
 * Output: 2
 * Explanation: Substring "aab" has 2 ocurrences in the original string.
 * It satisfies the conditions, 2 unique letters and size 3 (between minSize and maxSize).
 * Example 2:
 * <p>
 * Input: s = "aaaa", maxLetters = 1, minSize = 3, maxSize = 3
 * Output: 2
 * Explanation: Substring "aaa" occur 2 times in the string. It can overlap.
 * Example 3:
 * <p>
 * Input: s = "aabcabcab", maxLetters = 2, minSize = 2, maxSize = 3
 * Output: 3
 * Example 4:
 * <p>
 * Input: s = "abcde", maxLetters = 2, minSize = 3, maxSize = 3
 * Output: 0
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 10^5
 * 1 <= maxLetters <= 26
 * 1 <= minSize <= maxSize <= min(26, s.length)
 * s only contains lowercase English letters.
 */
public class MaximumNumberOfOccurrencesOfSubstring {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String, Integer> occurrences = new HashMap<>();
        int result = 0;
        for (int i = 0; i <= s.length() - minSize; i++) {
            String tmpStr = s.substring(i, i + minSize);
            if (tmpStr.chars().distinct().count() <= maxLetters) {
                occurrences.put(tmpStr, occurrences.getOrDefault(tmpStr, 0) + 1);
                result = Math.max(occurrences.get(tmpStr), result);
            }
        }
        return result;
    }
//    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
//        int result = 0;
////        for (int i = minSize; i <= maxSize; i++) {
//            for (int j = 0; j <= s.length() - minSize; j++) {
//                String tmpStr = s.substring(j, j + minSize);
//                int count = (int) tmpStr.chars().distinct().count();
//                if ( count<= maxLetters) {
//                    int tmpResult = calcOccurrences(s, tmpStr);
//                    if (tmpResult > result) {
//                        result = tmpResult;
//                    }
//                }
//            }
////        }
//        return result;
//    }
//    public int calcOccurrences(String str, String substr) {
//       int count = 0;
//       for (int i = 0; i <= str.length() - substr.length(); i++) {
//           if (substr.equals(str.substring(i, i + substr.length()))) {
//               count++;
//           }
//       }
//       return count;
//    }
}
