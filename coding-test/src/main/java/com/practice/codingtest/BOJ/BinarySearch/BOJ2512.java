package com.practice.codingtest.BOJ.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2512 {
    static int N;
    static int[] budget;
    static int requestTotal;
    static int totalBudget;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        budget = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            budget[i] = Integer.parseInt(st.nextToken());
            requestTotal += budget[i];
        }
        totalBudget = Integer.parseInt(br.readLine());
        Arrays.sort(budget);
        int ans = binarySearch(1, budget[budget.length - 1]);
        System.out.println(ans);
    }

    public static int binarySearch(int lo, int hi) {
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
        for (int i = 0; i < budget.length; i++) {
            if (budget[i] < mid) {
                count += budget[i];
            } else {
                count += mid;
            }
        }
        return count <= totalBudget;
    }
}
