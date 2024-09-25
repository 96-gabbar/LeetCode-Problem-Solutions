package com.autech.InterviewReady.Sorting;

public class SelectionSort {
    public int[] selectionSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            int min = Integer.MAX_VALUE;
            int min_index = -1;
            for(int j=i;j<nums.length;j++){
                if(min>nums[j]){
                    min = nums[j];
                    min_index = j;
                }
            }
            int x = nums[i];
            nums[i] = nums[min_index];
            nums[min_index] = x;
        }
        return nums;
    }
}
