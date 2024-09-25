package com.autech.InterviewReady.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LeadersInTheArray {
    public ArrayList<Integer> leaders(int[] nums) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> leaderArr = new ArrayList<>();
        for(int i=nums.length-1;i>-1;i--){
            if(nums[i]>max){
                max = nums[i];
                leaderArr.add(0,nums[i]);
            }
        }
        return leaderArr;
    }
}
