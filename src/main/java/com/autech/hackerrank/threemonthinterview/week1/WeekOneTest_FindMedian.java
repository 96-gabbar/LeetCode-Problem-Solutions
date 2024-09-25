package com.autech.hackerrank.threemonthinterview.week1;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Comparator;
import java.util.List;

@Component
public class WeekOneTest_FindMedian {
    public int findMedian(List<Integer> arr) {
        arr.sort(Comparator.comparingInt(a -> a));
        return arr.get(arr.size()/2);
    }
}
