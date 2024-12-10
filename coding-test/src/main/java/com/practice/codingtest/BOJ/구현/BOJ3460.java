package com.practice.codingtest.BOJ.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3460 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());

            int index = 0;

            while (n > 0) {
                if (n % 2 == 1) {
                    System.out.print(index + " ");
                }
                n /= 2;
                index++;
            }
            System.out.println();
        }
    }


}
