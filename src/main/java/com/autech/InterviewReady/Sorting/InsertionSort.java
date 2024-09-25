package com.autech.InterviewReady.Sorting;

public class InsertionSort {
    public int[] sort(int[] nums){
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]>nums[i]){
                    int x = nums[i];
                    nums[i] = nums[j];
                    nums[j] = x;
                }
            }
        }
        return nums;
    }
}
