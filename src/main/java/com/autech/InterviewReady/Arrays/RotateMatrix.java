package com.autech.InterviewReady.Arrays;

public class RotateMatrix {
    public void rotateMatrix(int[][] matrix) {
        for(int r=0;r<matrix.length;r++){
            for(int i=r+1;i<matrix[r].length;i++){
                int temp = matrix[r][i];
                matrix[r][i] = matrix[i][r];
                matrix[i][r] = temp;
            }
        }
        for(int[] arr: matrix){
            int i=0, j=arr.length-1;
            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
}
