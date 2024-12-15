package com.practice.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] small = new int[9];
        for (int i = 0; i < 9; i++) {
            small[i] = Integer.parseInt(br.readLine());
        }
        int sum = Arrays.stream(small).sum() - 100;
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (small[i] + small[j] == sum) {
                    small[i] = 0;
                    small[j] = 0;
                    Arrays.sort(small);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(small[k]);
                    }
                    return;
                }
            }
        }
    }
}
