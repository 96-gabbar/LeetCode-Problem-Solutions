package com.autech.InterviewReady.Sorting;

public class BubbleSort {
    public int[] bubbleSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int x = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = x;
                }
            }
        }
        return nums;
    }
}
