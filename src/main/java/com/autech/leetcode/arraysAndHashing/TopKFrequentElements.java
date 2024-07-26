package com.autech.leetcode.arraysAndHashing;

import java.util.*;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i:nums){
            freqMap.putIfAbsent(i, 1);
            freqMap.computeIfPresent(i, (key, v)->v+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(k, (p1, p2)-> p2.getValue()-p1.getValue());
        maxHeap.addAll(freqMap.entrySet());
        for(int i=0;i<k;i++){
            result[i]=maxHeap.poll().getKey();
        }
        return result;
    }
}
