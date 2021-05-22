package com.leetcode.strings;

public class LongestHappyPrefix {
    public String longestPrefix(String s) {
        String result = "";
        for (int i = s.length() - 1; i > 0; i--) {
            String tmpStr = s.substring(0, i);
            ;
            if (isSuffix(tmpStr, s)) {
                result = tmpStr;
                break;
            }
        }
        return result;
    }

    private boolean isSuffix(String s, String str) {
        return s.equals(str.substring(str.length() - s.length()));
    }
}
