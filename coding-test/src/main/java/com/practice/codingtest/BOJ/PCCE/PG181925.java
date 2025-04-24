package com.practice.codingtest.BOJ.PCCE;

public class PG181925 {
    public int gap(int a, int b) {
        return a - b;
    }
    public String solution(int[] numLog) {
        int t;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
            t = gap(numLog[i-1], numLog[i]);
            switch (t) {
                case -1:
                    sb.append("w");
                    break;
                case 1:
                    sb.append("s");
                    break;
                case -10:
                    sb.append("d");
                    break;
                case 10:
                    sb.append("a");
                    break;
            }
        }

        return sb.toString();
    }
}
