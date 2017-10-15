package com.codility.countingelements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public int solution(int X, int[] A) {

        Set<Integer> set = new HashSet<>(); 
        for (int i = 1; i < X + 1; i++) {
            set.add(i);
        }
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i])) {
                set.remove(A[i]);
            }
            if (set.size() == 0) {
                return i;
            }
        }
        return -1;
    }

}
