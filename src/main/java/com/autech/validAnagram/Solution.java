package com.autech.validAnagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i)) && (map.get(t.charAt(i)) > 1)){
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
            }else if(map.containsKey(t.charAt(i))){
                map.remove(t.charAt(i));
            }else
                return false;
        }
        return map.isEmpty();
    }
}
