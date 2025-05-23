package com.practice.codingtest.BOJ.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1477 {
    static int N;
    static int M;
    static int L;
    static int[] load;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        load = new int[N + 2];
        load[0] = 0;
        load[load.length - 1] = L;
        if (N != 0) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) {
                load[i] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(load);
        int ans = binarySearch();
        System.out.println(ans);
    }

    public static int binarySearch() {
        int lo = 1, hi = L;
        int ans = hi + 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (canDo(mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public static boolean canDo(int mid) {
        int need = 0;
        for (int i = 1; i < load.length; i++) {
            int gap = load[i] - load[i - 1];
            need += (gap - 1) / mid;
            if (need > M) {
                return false;
            }
        }
        return true;
    }
}
