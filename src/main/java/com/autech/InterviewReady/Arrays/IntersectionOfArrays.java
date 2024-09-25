package com.autech.InterviewReady.Arrays;

import java.util.Vector;
import java.util.stream.Collectors;

public class IntersectionOfArrays {

    public int[] intersectionArray(int[] nums1, int[] nums2) {
        Vector<Integer> intersectionArray = new Vector<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                intersectionArray.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else j++;
        }
        int[] result = new int[intersectionArray.size()];
        int k=0;
        for(int num: intersectionArray){
            result[k++] = num;
        }
        return result;
    }
}
