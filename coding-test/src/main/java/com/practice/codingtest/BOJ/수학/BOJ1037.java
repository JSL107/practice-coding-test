package com.practice.codingtest.BOJ.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//NOTE :: 약수
public class BOJ1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Long> list = new ArrayList<Long>();
        while (st.hasMoreTokens()) {
            list.add((long) Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        int a = n / 2;
        if (a <= 0) {
            System.out.println(list.get(a) * list.get(a));
        } else if (n % 2 == 0) {
            System.out.println(list.get(a) * list.get(a - 1));
        } else {
            System.out.println(list.get(a) * list.get(a));
        }
    }
}
