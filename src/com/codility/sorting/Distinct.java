package com.codility.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Distinct {
    
    public int solution(int[] A) {
        Set<Integer> set= new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (!set.contains(A[i])) {
                set.add(A[i]);
            } 
        }
        return set.size();
    }
    
    public int solution2(int[] A) {
        return Arrays.stream(A).distinct().toArray().length;
    }
    
}
