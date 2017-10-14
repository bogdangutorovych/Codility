package com.codility.timecomplexity;

public class TapeEquilibrium {

 public int solution(int[] A) {
        
        int head = 0;
        int tail = 0;
        for (int i = 0; i < A.length; i++) {
            tail += A[i];
        }
        int diff = Integer.MAX_VALUE;
        
        for (int i = 0; i < A.length - 1; i++) {
            head += A[i];
            tail -= A[i];
            diff = Math.min(diff, Math.abs(head - tail));
        }
        return diff;
    }

}
