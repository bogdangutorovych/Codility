package com.codility.timecomplexity;

import java.util.Arrays;

public class PermMissingElem {

    public int solution(int[] A) {
        
        if (A.length == 0) {
            return 1;
        }
        
        Arrays.parallelSort(A);
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i-1] + 1) {
                return A[i-1] +1;
            }
        }
        
        if (A.length != A[A.length-1]) {
            return A[0] - 1;
        } else {
            return A[A.length-1] + 1;
        }
    } 

}