package com.leetcode.strings;

public class LongestHappyPrefix {
    /*public String longestPrefix(String s) {
        String result = "";
        for (int i = s.length() - 1; i > 0; i--) {
            String tmpStr = s.substring(0, i);
            if (isSuffix(tmpStr, s)) {
                result = tmpStr;
                break;
            }
        }
        return result;
    }

    private boolean isSuffix(String s, String str) {
        return s.equals(str.substring(str.length() - s.length()));
    }*/
    public String longestPrefix(String s) {
        int[] prefixLengths = new int[s.length()];
        int currentIndex = 1;
        int lengthOfPrefix = 0;
        while (currentIndex < s.length()) {
            char suffixLastChar = s.charAt(currentIndex);
            char prefixLastChar = s.charAt(lengthOfPrefix);
            if ( suffixLastChar == prefixLastChar) {
                prefixLengths[currentIndex] = lengthOfPrefix + 1;
                currentIndex++;
                lengthOfPrefix++;
            } else {
                if (lengthOfPrefix == 0) {
                    currentIndex++;
                } else lengthOfPrefix = prefixLengths[lengthOfPrefix - 1];
            }
        }
        return s.substring(0, prefixLengths[s.length() - 1]);
    }
}
