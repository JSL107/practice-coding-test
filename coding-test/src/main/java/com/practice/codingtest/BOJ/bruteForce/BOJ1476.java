package com.practice.codingtest.BOJ.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// NOTE :: (1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19)
public class BOJ1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = 1, b = 1, c = 1;
        int E = Integer.parseInt(st.nextToken()); // 1
        int S = Integer.parseInt(st.nextToken()); // 2
        int M = Integer.parseInt(st.nextToken()); // 3
        long year = 0;

        while(true) {
            year++;
            if (a == 16) {
                a = 1;
            }
            if (b == 29) {
                b = 1;
            }
            if (c == 20) {
                c = 1;
            }
            if (a == E && b == S && c == M) {
                break;
            }
            a++;
            b++;
            c++;

        }
        System.out.println(year);
    }
}
