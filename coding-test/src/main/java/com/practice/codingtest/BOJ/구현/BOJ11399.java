package com.practice.codingtest.BOJ.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] times = br.readLine().split(" ");
        int[] workTime = new int[n];

        for (int i = 0; i < n; i++) {
            workTime[i] = Integer.parseInt(times[i]);
        }
        Arrays.sort(workTime);
        int result = 0;
        int data = 0;
        for (int i = 0; i < n; i++) {
            data = data + workTime[i];
            result += data;

        }
        System.out.println(result);
    }
}
