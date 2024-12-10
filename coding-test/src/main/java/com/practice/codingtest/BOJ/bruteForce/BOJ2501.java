package com.practice.codingtest.BOJ.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int p = Integer.parseInt(temp[0]);
        int q = Integer.parseInt(temp[1]);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                list.add(i);
            }
        }

        if (list.size() >= q) {
            System.out.println(list.get(q - 1));
        } else {
            System.out.println(0);
        }
    }
}
