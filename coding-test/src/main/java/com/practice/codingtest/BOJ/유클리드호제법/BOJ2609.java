package com.practice.codingtest.BOJ.유클리드호제법;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        System.out.println(GCD(a,b));
        System.out.println(LCM(a,b));
    }

    public static int GCD(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}
