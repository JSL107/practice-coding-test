package com.practice.codingtest.BOJ.PCCE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PG181947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] answer = br.readLine().split(" ");

        int a = Integer.parseInt(answer[0]);
        int b = Integer.parseInt(answer[1]);

        System.out.printf("%d + %d = %d", a, b, a+b);
    }
}
