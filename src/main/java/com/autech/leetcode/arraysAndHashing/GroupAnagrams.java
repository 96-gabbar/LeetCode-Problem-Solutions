package com.autech.leetcode.arraysAndHashing;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] charArrOfString = strs[i].toCharArray();
            Arrays.sort(charArrOfString);
            String anagramKey = Arrays.toString(charArrOfString);
            anagramMap.computeIfAbsent(anagramKey, s -> new ArrayList<>()).add(strs[i]);
        }
        return anagramMap.values().stream().toList();
    }
}
