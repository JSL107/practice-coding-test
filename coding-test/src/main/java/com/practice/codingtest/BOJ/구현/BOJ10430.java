package com.practice.codingtest.BOJ.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data;
        data = br.readLine().split(" ");
        int A = Integer.parseInt(data[0]);
        int B = Integer.parseInt(data[1]);
        int C = Integer.parseInt(data[2]);
        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }
}
