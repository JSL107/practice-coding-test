package com.practice.codingtest.BOJ.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2343 {
    static int N;
    static int M;
    static int[] lectures;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        lectures = new int[N];

        long max = 0;
        long min = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            lectures[i] = Integer.parseInt(st.nextToken());
            max += lectures[i];
            min = Math.max(min, lectures[i]);
        }

        long ans = binarySearch(min, max);
        System.out.println(ans);
    }

    public static long binarySearch(long lo, long hi) {
        long ans = hi + 1;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (canDo(mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public static boolean canDo(long mid) {
        long count = 1;
        long sum = 0;

        for (int len : lectures) {
            if (sum + len > mid) {
                count++;
                sum = len;
            } else {
                sum += len;
            }
        }

        return count <= M;
    }
}
