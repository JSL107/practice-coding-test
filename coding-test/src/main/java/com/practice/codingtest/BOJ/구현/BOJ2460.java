package com.practice.codingtest.BOJ.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 10;
        String[] temp = new String[n + 1];
        int[] train = new int[n + 1];


        for (int i = 1; i <= n; i++) {
            temp[i] = br.readLine();
            int out = Integer.parseInt(temp[i].split(" ")[0]);
            int in = Integer.parseInt(temp[i].split(" ")[1]);
            int passenger = in - out;
            train[i] = train[i - 1] + passenger;
        }
        Arrays.sort(train);
        System.out.println(train[train.length - 1]);
    }
}
