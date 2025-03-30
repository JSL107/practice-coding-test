package com.practice.codingtest.BOJ.PCCE;

public class PG181940 {
    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(my_string);
        }

        return sb.toString();
    }
}
