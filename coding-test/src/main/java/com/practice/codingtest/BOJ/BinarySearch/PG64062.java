package com.practice.codingtest.BOJ.BinarySearch;

import java.util.Arrays;

public class PG64062 {
    public static void main(String[] args) {
        int[] stones = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
        int k = 3;
    }

    public static int solution(int[] stones, int k) {
        int answer = 0;
        int lo = 1;
        int hi = Arrays.stream(stones).max().getAsInt();
        answer = paraMax(lo, hi, stones, k);
        return answer;
    }


    public static int paraMax(int lo, int hi, int[] stones, int k) {
        int ans = lo;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (canDo(mid, stones, k)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static boolean canDo(int mid, int[] stones, int k) {
        int cnt = 0;
        for (int st : stones) {
            if (st - mid < 0) cnt++;
            else cnt = 0;

            if (cnt >= k) return false;
        }
        return true;
    }

}
