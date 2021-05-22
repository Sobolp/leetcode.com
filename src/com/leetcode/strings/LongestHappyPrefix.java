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
        char[] arrS = s.toCharArray();
        char[] assStr = str.toCharArray();
        for (int i = 0; i < arrS.length; i++) {
            if (assStr[assStr.length - 1 - i] != arrS[arrS.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
