package com.autech.InterviewReady.Arrays;

public class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        int pos=0;
        int neg=1;
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                result[neg+=2] = nums[i];
            }else{
                result[pos+=2] = nums[i];
            }
        }
        return result;
    }
}
