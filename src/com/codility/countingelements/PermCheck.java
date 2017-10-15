package com.codility.countingelements;

import java.util.Arrays;

public class PermCheck {

    public int solution(int[] A) {

        if ((A.length < 2) && A[0] == 1) {
            return 1;
        } else if ((A.length < 2) && A[0] != 1) {
            return 0;
        }

        Arrays.parallelSort(A);
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i-1] + 1)  {
                return 0;
            } 
        }
        if (A.length != A[A.length-1]) {
            return 0;
        } else {
            return 1;
        }
    }

}