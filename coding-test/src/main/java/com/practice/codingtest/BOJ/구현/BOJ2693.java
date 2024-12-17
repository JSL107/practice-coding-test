package com.practice.codingtest.BOJ.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BOJ2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        List<Integer> list;
        for (int i = 0; i < T; i++) {
            String[] temp = br.readLine().split(" ");
            list = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                list.add(Integer.parseInt(temp[j]));
            }
            Collections.sort(list, Collections.reverseOrder());
            System.out.println(list.get(2));
        }
    }
}
