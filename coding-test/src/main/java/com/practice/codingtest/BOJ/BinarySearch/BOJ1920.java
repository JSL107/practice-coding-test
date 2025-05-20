package com.practice.codingtest.BOJ.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int testCase;
        st = new StringTokenizer(br.readLine(), " ");
        Arrays.sort(A);
        
        for (int i = 0; i < M; i++) {
            testCase = Integer.parseInt(st.nextToken());
            int ans = binarySearch(A, testCase);
            System.out.println(ans);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                return 1;
            } else if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return 0;
    }
}
