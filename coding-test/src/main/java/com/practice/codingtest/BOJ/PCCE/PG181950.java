package com.practice.codingtest.BOJ.PCCE;

import java.io.*;

public class PG181950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        String a = arr[0];
        int n = Integer.parseInt(arr[1]);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(a);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
