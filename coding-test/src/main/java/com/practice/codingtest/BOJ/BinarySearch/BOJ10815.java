package com.practice.codingtest.BOJ.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int ans;
        StringBuilder sb = new StringBuilder();
        Arrays.sort(cards);
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            ans = upperBound(cards, target) - lowerBound(cards, target);
            sb.append(ans).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static int upperBound(int[] card, int target) {
        int lo = 0, hi = card.length;
        while(lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if(card[mid] > target) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }

    public static int lowerBound(int[] card, int target) {
        int lo = 0, hi = card.length;
        while(lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if(card[mid]>= target) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }
}
