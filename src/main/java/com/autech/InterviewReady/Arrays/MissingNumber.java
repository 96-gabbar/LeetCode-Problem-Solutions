package com.autech.InterviewReady.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int totalSum = nums.length * (nums.length+1)/2;
        int sum = 0;
        for(int num:nums){
            sum+=num;
        }
        return totalSum-sum;
    }
}
