package com.autech.leetcode.arraysAndHashing;

import java.util.*;

//TODO :: Not completed
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            Set<Character> charSetRow = new HashSet<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
            Set<Character> charSetCol = new HashSet<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(charSetRow.contains(board[i][j])){
                        charSetRow.remove(board[i][j]);
                    }else
                        return false;
                }
                if(board[j][i]!='.'){
                    if(charSetCol.contains(board[j][i])){
                        charSetCol.remove(board[j][i]);
                    }else
                        return false;
                }
            }
        }
        Set<Character> charSetBox = new HashSet<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
        for(int k=0;k<9;k+=3) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[k+i][k+j] != '.') {
                        if (charSetBox.contains(board[k+i][k+j])) {
                            charSetBox.remove(board[k+i][k+j]);
                        } else
                            return false;
                    }
                }
            }
        }
        return true;
    }
}
