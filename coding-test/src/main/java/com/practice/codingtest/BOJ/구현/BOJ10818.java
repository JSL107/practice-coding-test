package com.practice.codingtest.BOJ.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = -1000001;
        int min = 1000001;
        while (st.hasMoreTokens()) {
            int val = Integer.parseInt(st.nextToken());
            if (val > max) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
        }
        System.out.print(min + " " + max);
    }
}
