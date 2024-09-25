package com.autech.InterviewReady.Arrays;

public class LeftRotateByK {
    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k%n;

        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, n-1);
        reverseArray(nums, 0, n-1);
    }

    private void reverseArray(int[] arr, int start, int end){
        int i=start;
        int j=end;
        while(i<j){
            swapElements(arr, i++, j--);
        }
    }

    private void swapElements(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
