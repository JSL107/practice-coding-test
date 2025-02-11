package com.practice.codingtest.BOJ.bruteForce;

import java.io.*;

public class BOJ1784 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int r = 0;
        for (int i = 1; i <= n; i*=10) {
            r += n - i + 1;
        }
        bw.write(String.valueOf(r));
        bw.flush();
        bw.close();
    }
}
