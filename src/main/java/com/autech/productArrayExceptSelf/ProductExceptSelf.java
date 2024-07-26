package com.autech.productArrayExceptSelf;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProd = new int[nums.length];
        int[] postfixProd = new int[nums.length];
        int[] result = new int[nums.length];
        prefixProd[0] = nums[0];
        postfixProd[nums.length-1] = nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            prefixProd[i] = prefixProd[i-1]*nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            postfixProd[i] = postfixProd[i+1]*nums[i];
        }
        result[0] = postfixProd[1];
        result[nums.length-1] = prefixProd[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            result[i] = prefixProd[i-1]*postfixProd[i+1];
        }
        return result;
    }
}
