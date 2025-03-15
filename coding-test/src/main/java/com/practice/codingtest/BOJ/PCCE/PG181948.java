package com.practice.codingtest.BOJ.PCCE;

import java.io.*;

public class PG181948 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = "!@#$%^&*(\\'\"<>?:;";
        bw.write(a);
        bw.flush();
        bw.close();

    }
}
