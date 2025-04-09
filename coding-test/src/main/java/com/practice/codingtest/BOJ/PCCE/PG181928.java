package com.practice.codingtest.BOJ.PCCE;

public class PG181928 {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for(int i : num_list) {
            if(i % 2 == 0){
                even.append(i);
            } else {
                odd.append(i);
            }
        }
        return Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
    }
}
