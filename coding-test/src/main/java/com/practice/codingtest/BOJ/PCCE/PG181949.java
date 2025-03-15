package com.practice.codingtest.BOJ.PCCE;

import java.io.*;

public class PG181949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] arr = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char a : arr) {
            if (Character.isUpperCase(a)) {
                a = Character.toLowerCase(a);
            } else {
                a = Character.toUpperCase(a);
            }
            sb.append(a);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
