package com.practice.codingtest.BOJ.PCCE;

public class PG181930 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if( a!=b && b != c && a != c) {
            answer = a + b + c;
        } else {
            double v = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
            if ( a == b && b== c) {
                answer = (a+b+c) * (int) v * (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
            } else {
                answer = (a+b+c) * (int) v;
            }
        }

        return answer;
    }
}
