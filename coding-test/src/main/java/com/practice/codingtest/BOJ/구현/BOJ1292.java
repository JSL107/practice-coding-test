package com.practice.codingtest.BOJ.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int start = Integer.parseInt(temp[0]);
        int end = Integer.parseInt(temp[1]);
        int a = 1;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < end; i++) {
            for (int j = 0; j <= i; j++) {
                al.add(a);
            }
            a++;
        }
        int result = 0;
        for (int i = start-1; i < end; i++) {
            result += al.get(i);
        }
        System.out.println(result);

    }
}
