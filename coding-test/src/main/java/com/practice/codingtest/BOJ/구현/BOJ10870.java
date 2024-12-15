package com.practice.codingtest.BOJ.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ10870 {
    static PriorityQueue<Integer> pq = new PriorityQueue<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer result = 0;
        if (n > 0) {
            pq.add(0);
            pq.add(1);
            result = slidingWindow(n);
        }
        System.out.println(result);
    }

    public static Integer slidingWindow(int n) {
        for (int i = 2; i <= n; i++) {
            Integer left = pq.poll();
            Integer right = pq.peek();
            if (left != null && right != null) {
                pq.add(left + right);
            }
        }
        pq.poll();
        return pq.peek();
    }

}
