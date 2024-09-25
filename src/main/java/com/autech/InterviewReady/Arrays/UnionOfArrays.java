package com.autech.InterviewReady.Arrays;

import java.util.Arrays;

public class UnionOfArrays {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int[] unionArray = new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        int lastInserted = -1;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                if(nums1[i]!=lastInserted) {
                    lastInserted = nums1[i];
                    unionArray[k++] = nums1[i];
                }
                i++;
                j++;
            }else if (nums1[i]<nums2[j]){
                if(nums1[i]!=lastInserted){
                    lastInserted = nums1[i];
                    unionArray[k++] = nums1[i];
                }
                i++;
            }else{
                if(nums2[j]!=lastInserted){
                    lastInserted = nums2[j];
                    unionArray[k++] = nums2[j];
                }
                j++;
            }
        }

        while(i<nums1.length){
            if(nums1[i]!=lastInserted){
                lastInserted = nums1[i];
                unionArray[k++] = nums1[i++];
            }else{
                i++;
            }
        }

        while(j<nums2.length){
            if(nums2[j]!=lastInserted){
                lastInserted = nums2[j];
                unionArray[k++] = nums2[j++];
            }else{
                j++;
            }
        }
        int[] result = new int[k];
        for(int a=0;a<k;a++){
            result[a] = unionArray[a];
        }
        return result;
    }
}
