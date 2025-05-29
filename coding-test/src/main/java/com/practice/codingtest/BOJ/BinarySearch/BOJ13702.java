package com.practice.codingtest.BOJ.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ13702 {
    static int N;
    static int K;
    static int[] mak;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // 단, N <= K
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        mak = new int[N];

        int ans;
        for (int i = 0; i < N; i++) {
            mak[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(mak);
        ans = paramatrixMax(1, mak[mak.length - 1]);
        System.out.println(ans);
    }

    public static int paramatrixMax(int lo, int hi) {
        int ans = lo - 1;
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
        for (int ml : mak) {
            count += ml / mid;
            if (count >= K) {
                return true;
            }
        }
        return false;
    }
}
