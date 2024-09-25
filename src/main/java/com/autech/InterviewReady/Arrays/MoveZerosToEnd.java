package com.autech.InterviewReady.Arrays;

public class MoveZerosToEnd {
    public void solve(int[] nums){
        int j = -1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }

        for(int i=j+1;i<nums.length && j<nums.length;i++){
            if(nums[i]!=0){
                swap(nums, j, i);
                j++;
            }
        }
    }

    private void swap(int[] arr, int i, int j){
        if(i!=j && i<arr.length && j<arr.length){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
