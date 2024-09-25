package com.autech.InterviewReady.Sorting;

public class QuickSort {
    public int[] sort(int[] nums){
        quickSort(nums, 0, nums.length-1);
        return nums;
    }

    private void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    private int partition(int[] arr, int low, int high){
        int pivot = arr[high];

        int i = low;

        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);
        return i;
    }

    private void swap(int[] nums, int i, int j){
        int x = nums[i];
        nums[i] = nums[j];
        nums[j] = x;
    }
}
