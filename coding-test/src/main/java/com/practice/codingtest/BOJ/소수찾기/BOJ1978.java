package com.practice.codingtest.BOJ.소수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        int count;
        int result = 0;
        int number;
        for (int i = 0; i < N; i++) {
            number = Integer.parseInt(numbers[i]);
            count = 1;
            for (int j = 2; j <= number; j++) {
                if (number % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                result++;
            }
        }
        System.out.println(result);
    }
}
