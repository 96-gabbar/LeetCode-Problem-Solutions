package com.autech.InterviewReady.Arrays;

public class RemoveDuplicates {
    public int solve(int[] arr){
        int i=0;
        for(int j=1;j<arr.length && i<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
            }
        }
        return i+1;
    }
}
