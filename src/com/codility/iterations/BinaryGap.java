package com.codility.iterations;

import java.util.stream.Stream;

public class BinaryGap {

    static int solution(int N) {

        return Stream
                .of(
                    Integer.toBinaryString(N)
                    .replaceAll("0+$", "")
                    .split("1+"))
                    .filter(a -> a != null)
                    .map(String::length)
                    .max(Integer::compare)
                    .orElse(0);
    }

}