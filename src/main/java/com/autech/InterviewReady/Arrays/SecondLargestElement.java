package com.autech.InterviewReady.Arrays;

import com.autech.InterviewReady.Sorting.MergeSort;

import java.util.Arrays;

public class SecondLargestElement {

    public int solve(int[] nums){
        Arrays.sort(nums);
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[nums.length-1]){
                return nums[i];
            }
        }
        return -1;
    }
}
