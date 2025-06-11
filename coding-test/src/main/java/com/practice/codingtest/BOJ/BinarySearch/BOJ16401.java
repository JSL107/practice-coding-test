package com.practice.codingtest.BOJ.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ16401 {
    static int N; // 과자의 수
    static int M; // 조카의 수
    static int[] cookie;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        cookie = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            cookie[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cookie);
        int ans = paraMax(1, cookie[cookie.length - 1]);
        System.out.println(ans);

    }

    public static int paraMax(int lo, int hi) {
        int ans = 0;
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
        int count = 0;
        for (int c : cookie) {
            count += c / mid;
            if (count >= M) return true;
        }
        return false;
    }

}