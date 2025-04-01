package com.practice.codingtest.BOJ.PCCE;

public class PG181936 {
    public int solution(int number, int n, int m) {
        boolean result = number % n == 0 && number % m == 0;
        return result ? 1 : 0;
    }
}
