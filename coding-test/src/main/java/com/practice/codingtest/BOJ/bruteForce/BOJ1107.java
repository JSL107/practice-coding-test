package com.practice.codingtest.BOJ.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1107 {
    static int N;
    static boolean[] error;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        int errorCnt = Integer.parseInt(br.readLine());
        error = new boolean[10];

        //고장난 게 없을 경우 예외처리
        if (errorCnt == 0) return;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < errorCnt; i++) {
            int idx = Integer.parseInt(st.nextToken());
            error[idx] = true;
        }
        pro();
    }

    static void pro() {
        int click = Math.abs(N - 100); //+, -를 누르는 횟수

        for (int i = 0; i < 1000000; i++) {
            String s = String.valueOf(i);

            boolean isBreak = false;
            for (int j = 0; j < s.length(); j++) {
                if (error[s.charAt(j) - '0']) {
                    isBreak = true;
                    break;
                }
            }

            //i에서 누른 버튼들이 모두 고장나지 않을 경우
            if (!isBreak) {
                int value = Math.abs(N - i) + s.length();
                click = Math.min(value, click);
            }
        }
        System.out.println(click);
    }
}
