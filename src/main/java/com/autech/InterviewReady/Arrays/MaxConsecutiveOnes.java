package com.autech.InterviewReady.Arrays;

public class MaxConsecutiveOnes {
    public int solve(int[] nums){
        int max = 0;
        int cnt = 0;
        for(int num : nums){
            if(num==1){
                cnt++;
                max = Math.max(max, cnt);
            }else{
                cnt = 0;
            }
        }
        return max;
    }
}
