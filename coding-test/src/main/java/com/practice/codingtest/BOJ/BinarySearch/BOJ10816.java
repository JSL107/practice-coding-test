package com.practice.codingtest.BOJ.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);
        int ans;
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            ans = upperBound(cards, target) - lowerBound(cards, target);
            sb.append(ans).append(" ");
        }

        System.out.println(sb);
    }

    public static int lowerBound(int[] cards, int target) {
        int lo = 0, hi = cards.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (cards[mid] >= target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }

        }
        return lo;
    }

    public static int upperBound(int[] cards, int target) {
        int lo = 0, hi = cards.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (cards[mid] > target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
