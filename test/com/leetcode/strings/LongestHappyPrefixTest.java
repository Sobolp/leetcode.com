package com.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestHappyPrefixTest {

    LongestHappyPrefix longestHappyPrefix = new LongestHappyPrefix();
    @Test
    void longestPrefixTest() {
        /**
         * Example 1:
         * Input: s = "level"
         * Output: "l"
         * Explanation: s contains 4 prefix excluding itself ("l", "le", "lev", "leve"), and suffix ("l", "el", "vel", "evel"). The largest prefix which is also suffix is given by "l".
         */
        assertEquals("l", longestHappyPrefix.longestPrefix("level"));

        /**
         * Example 2:
         *
         * Input: s = "ababab"
         * Output: "abab"
         * Explanation: "abab" is the largest prefix which is also suffix. They can overlap in the original string.
         */
        assertEquals("abab", longestHappyPrefix.longestPrefix("ababab"));

        /**
         * Example 3:
         *
         * Input: s = "leetcodeleet"
         * Output: "leet"
         */
        assertEquals("leet", longestHappyPrefix.longestPrefix("leetcodeleet"));

        /**
         * Example 4:
         *
         * Input: s = "a"
         * Output: ""
         */
        assertEquals("", longestHappyPrefix.longestPrefix("a"));
    }
}