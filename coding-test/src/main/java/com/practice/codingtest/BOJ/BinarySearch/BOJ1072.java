package com.practice.codingtest.BOJ.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1072 {
    static long X;
    static long Y;
    static long Z;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        Z = (Y * 100) / X;

        if (Z >= 99) { // Z가 99면 승률이 절대로 변하지 않으니깐
            System.out.println(-1);
            return;
        }
        int ans = ParametricMax(1, Integer.MAX_VALUE);
        System.out.println(ans);
    }

    public static int ParametricMax(int lo, int hi) {
        int ans = lo;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if ((Y + mid) * 100 / (X + mid) > Z) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
}