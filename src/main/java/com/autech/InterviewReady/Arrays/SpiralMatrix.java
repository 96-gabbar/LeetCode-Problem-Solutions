package com.autech.InterviewReady.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int left = 0, top = 0;
        int right = matrix[0].length-1, bottom = matrix.length-1;
        while(left<=right && top<=bottom){
            for(int i = left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i<=bottom ; i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(left<=right) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(top<=bottom) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
