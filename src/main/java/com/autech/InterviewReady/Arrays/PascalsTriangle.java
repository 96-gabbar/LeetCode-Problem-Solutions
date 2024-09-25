package com.autech.InterviewReady.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> pascalTriangle(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            result.add(generateRow(row));
        }
        return result;
    }

    private List<Integer> generateRow(int row){
        long ans = 1;
        List<Integer> result = new ArrayList<>();
        result.add((int) ans);
        for(int col=1;col<row;col++){
            ans = ans * (row-col);
            ans = ans/col;
            result.add((int) ans);
        }
        return result;
    }
}
