package com.practice.codingtest.BOJ.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2110 {
    static int N;
    static int C;
    static int[] wifi;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        wifi = new int[N];

        for (int i = 0; i < N; i++) wifi[i] = Integer.parseInt(br.readLine());

        Arrays.sort(wifi);

        int ans = paraMax(1, wifi[N - 1]);
        System.out.println(ans);
    }

    public static int paraMax(int lo, int hi) {
        int ans = lo;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (canDo(mid)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static boolean canDo(int mid) {
        int count = 1;
        int installed = wifi[0];
        for (int i = 1; i < N; i++) {
            if (wifi[i] - installed >= mid) {
                count++;
                installed = wifi[i];
            }
        }
        return count >= C;
    }
}