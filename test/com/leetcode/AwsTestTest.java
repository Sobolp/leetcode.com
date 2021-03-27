package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AwsTestTest {

    AwsTest inst = new AwsTest();
    String testStr;
    int testRows;
    @Test
    void solutionTest() {
        /**
         * given n=2 S ="1A 2F 1C"
         */
        testStr = "1A 2F 1C";
        testRows = 2;
        assertEquals(2, inst.solution(testRows, testStr));

        /**
         * given n=1 S =""
         */
        testStr = "";
        testRows = 1;
        assertEquals(2, inst.solution(testRows, testStr));

        /**
         * given n=1 S ="1H"
         */
        testStr = "1H";
        testRows = 1;
        assertEquals(1, inst.solution(testRows, testStr));

        /**
         * given n=1 S ="1H 1C"
         */
        testStr = "1H 1C";
        testRows = 1;
        assertEquals(1, inst.solution(testRows, testStr));

        /**
         * given n=1 S ="1F 1C"
         */
        testStr = "1F 1C" +
                "";
        testRows = 1;
        assertEquals(0, inst.solution(testRows, testStr));
    }
}