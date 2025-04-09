package com.practice.codingtest.BOJ.PCCE;

public class PG181929 {
    public int solution(int[] num_list) {
        int temp = 1;
        int temp1 = 0;
        for(int i : num_list) {
            temp *= i;
            temp1 += i;
        }
        return temp < (int)Math.pow(temp1, 2) ? 1 : 0;
    }
}
