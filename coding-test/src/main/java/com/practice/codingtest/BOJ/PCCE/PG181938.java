package com.practice.codingtest.BOJ.PCCE;

public class PG181938 {
    public int solution(int a, int b) {
        int pair1 = Integer.parseInt(a+String.valueOf(b));
        int pair2 = 2 * a * b;
        return Math.max(pair1, pair2);
    }
}
