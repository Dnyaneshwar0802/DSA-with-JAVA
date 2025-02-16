package com.javatpoint.basic;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharFinding {
    public static void main(String[] args) {
     String str="i am dnyaneshwar bagal";
        Map<Character,Integer> hm= new HashMap<Character, Integer>();
        for(int i=0;i<str.length();i++)
        {
            if(hm.containsKey(str.charAt(i))) {
                hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
            }
            else
                hm.put(str.charAt(i),1);
        }
        System.out.println(hm);
    }
}
