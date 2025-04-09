package com.practice.codingtest.BOJ.PCCE;

import java.util.ArrayList;

public class PG181931 {
    public int solution(int a, int d, boolean[] included) {
        ArrayList<Integer> ar = new ArrayList<>();

        for (int idx = 0; idx < included.length; idx++) {
            if (included[idx]) {
                ar.add(a);
            }
            a += d;
        }
        a = 0;
        for (int idx = 0; idx < ar.size(); idx++) {
            a += ar.get(idx);
        }
        return a;
    }
}
