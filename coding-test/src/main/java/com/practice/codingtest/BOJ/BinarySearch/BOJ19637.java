package com.practice.codingtest.BOJ.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// lower, upperbound 문제?
public class BOJ19637 {
    static String[] title;
    static int[] limit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 칭호의 개수
        int M = Integer.parseInt(st.nextToken()); // 캐릭터의 개수
        title = new String[N];
        limit = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            title[i] = st.nextToken();
            limit[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int damage = Integer.parseInt(br.readLine());
            int idx = lowerBound(limit,damage);
            sb.append(title[idx]).append("\n");
        }

        System.out.println(sb);


    }

    public static int lowerBound(int[] arr, int target) {
        int lo = 0, hi = arr.length-1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
