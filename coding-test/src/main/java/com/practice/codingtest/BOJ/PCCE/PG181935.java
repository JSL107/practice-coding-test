package com.practice.codingtest.BOJ.PCCE;

public class PG181935 {
    public int solution(int n) {
        int odd = 0;
        int even = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even += (i * i);
            } else {
                odd += i;
            }
        }

        return n % 2 == 0 ? even : odd;
    }
}
