package com.practice.codingtest.BOJ.PCCE;

public class PG181934 {
    public static int solution(String ineq, String eq, int n, int m) {
        boolean result = false;
        switch (ineq) {
            case ">":
                if (eq.equals("=")) {
                    result = n >= m;
                    break;
                } else {
                    System.out.println(">");
                    break;
                }
            case "<":
                if (eq.equals("=")) {
                    result = n <= m;
                    break;
                } else {
                    result = n < m;
                    break;
                }
        }
        return result ? 1 : 0;
    }
}
