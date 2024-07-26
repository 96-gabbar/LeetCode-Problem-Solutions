package com.autech;


import com.autech.leetcode.arraysAndHashing.TopKFrequentElements;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the world of LeetCode problems!");
        int[] nums = new int[]{1,1,1,2,2,3};
        System.out.println(Arrays.toString(TopKFrequentElements.topKFrequent(nums, 2)));
    }
}