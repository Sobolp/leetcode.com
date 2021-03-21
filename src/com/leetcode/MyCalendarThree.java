package com.leetcode;

import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;


public class MyCalendarThree {
    private int sequence;

    private TreeMap<Integer, Integer> cal;

    public MyCalendarThree() {
        cal = new TreeMap<>();
    }

    public int book(int start, int end) {
        cal.put(start, cal.getOrDefault(start, 0) + 1);
        cal.put(end, cal.getOrDefault(end, 0) - 1);

        AtomicInteger events = new AtomicInteger();
        return cal.values().stream()
                .map(events::addAndGet)
                .mapToInt( v -> v)
                .max().orElse(0);
    }
}
