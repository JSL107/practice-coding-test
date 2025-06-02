package com.practice.codingtest.BOJ.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2805 {
    static int N;
    static int M;
    static int[] heights;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        heights = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(heights);

        long ans = parametricMax(1, heights[heights.length - 1]);
        System.out.println(ans);
    }

    public static long parametricMax(long lo, long hi) {
        long ans = lo - 1;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (canDo(mid)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static boolean canDo(long mid) {
        long want = 0;
        for (int H : heights) {
            if (H > mid) {
                want += H - mid;
                if (want >= M) return true;

            }
        }
        return false;
    }
}
