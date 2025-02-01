package com.practice.codingtest.BOJ.소수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1929 {
    static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        prime = new boolean[end + 1];
        isPrime(start, end);
        for (int i = start; i < prime.length; i++) {
            if (prime[i]) {
                System.out.println(i);
            }
        }
    }

    public static void isPrime(int start, int end) {
        Arrays.fill(prime, true);

        prime[0] = prime[1] = false;

        for (int i = start; i <= Math.sqrt(end); i++) {
            if(prime[i]) {
                for (int j = i * i; j <= end; j += i) {
                    prime[j] = false;
                }
            }
        }
    }
}
