package com.practice.codingtest.BOJ.BinarySearch;

import java.util.*;

class PG43238 {
    public long main(int n, int[] times) {
        Arrays.sort(times);
        long lo = 1;
        long hi = (long) times[times.length - 1] * n;

        return paraMin(lo, hi, n, times);
    }

    public long paraMin(long lo, long hi, int n, int[] times) {
        long ans = hi;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (canDo(mid, n, times)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public boolean canDo(long mid, int n, int[] times) {
        long total = 0;
        for (int t : times) {
            total += mid / t;
            if (total >= n) break;
        }
        return total >= n;
    }
}
