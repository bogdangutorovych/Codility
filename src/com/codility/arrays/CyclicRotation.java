package com.codility.arrays;


public class CyclicRotation {
    
    static int[] solution(int[] A, int K) {
        
        int[] returnArray = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            returnArray[(i + K) % A.length] = A[i];
        }
        return returnArray;
    }

}