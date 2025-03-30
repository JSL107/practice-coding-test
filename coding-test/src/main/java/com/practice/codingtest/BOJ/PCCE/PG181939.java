package com.practice.codingtest.BOJ.PCCE;

public class PG181939 {
    public int solution(int a, int b) {
        int answer = 0;

        String pair1 = a + String.valueOf(b);
        String pair2 = b + String.valueOf(a);
        int nPair1 = Integer.parseInt(pair1);
        int nPair2 = Integer.parseInt(pair2);

        answer = Math.max(nPair1, nPair2);
        return answer;
    }
}
