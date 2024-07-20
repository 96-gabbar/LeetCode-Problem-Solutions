package com.autech.twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> elementMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!elementMap.containsKey(nums[i])){
                elementMap.put(nums[i], i);
            }else{
                if(elementMap.containsKey(target-nums[i])){
                    result[0]=i;
                    result[1]=elementMap.get(target-nums[i]);
                    return result;
                }
            }
        }

        for(Map.Entry<Integer, Integer> entry: elementMap.entrySet()){
            if(elementMap.containsKey(target-entry.getKey())){
                result[0]=entry.getValue();
                result[1]=elementMap.get(target-entry.getKey());
                return result;
            }
        }
        return result;
    }
}
