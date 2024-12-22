package com.practice.codingtest.BOJ.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14888 {
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static int[] numbers;
    static int[] signs = new int[4];
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            signs[i] = Integer.parseInt(st.nextToken());
        }

        dfs(numbers[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int num, int idx) {
        if (idx == N) {
            max = Math.max(max, num); // 최대값 찾기
            min = Math.min(min, num); // 최소값 찾기
            return;
        }
        for (int i = 0; i < 4; i++) {
            // 연산자 개수가 한개 이상인 경우에
            if (signs[i] > 0) {
                // 해당 연산자를 1 감소
                signs[i]--;

                switch (i) {
                    case 0:
                        dfs(num + numbers[idx], idx + 1);
                        break;
                    case 1:
                        dfs(num - numbers[idx], idx + 1);
                        break;
                    case 2:
                        dfs(num * numbers[idx], idx + 1);
                        break;
                    case 3:
                        dfs(num / numbers[idx], idx + 1);
                        break;
                }
                // 재귀 호출 후 연산자 복구
                signs[i]++;
            }
        }

    }
}
