package com.practice.codingtest.BOJ.BinarySearch;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ1166 {

    static long N;
    static double L, W, H;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Long.parseLong(st.nextToken());
        L = Double.parseDouble(st.nextToken());
        W = Double.parseDouble(st.nextToken());
        H = Double.parseDouble(st.nextToken());

        double lo = 0.0;
        double hi = Math.min(L, Math.min(W, H));
        double ans = paramericMax(lo, hi);

        // 원하는 오차(10^-9)보다 넉넉하게 출력
        System.out.println(ans);
    }

    public static double paramericMax(double lo, double hi) {
        // 실수 이분: 100회면 2^-100 ≈ 8e-31, 1e-9보다 훨씬 작다.
        for (int i = 0; i < 100; i++) {
            double mid = lo + (hi - lo) / 2.0;
            if (canDo(mid)) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    private static boolean canDo(double target) {
        long x = (long) (L / target);
        long y = (long) (W / target);
        long z = (long) (H / target);

        return (x * y * z) >= N;
    }
}