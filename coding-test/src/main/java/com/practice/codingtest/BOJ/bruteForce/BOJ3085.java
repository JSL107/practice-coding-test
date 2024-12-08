package com.practice.codingtest.BOJ.bruteForce;

import java.io.*;

/*
@Parameters
int n : 행, 열의 개수
char[][] candy : 사탕 배열
*/
public class BOJ3085 {
    static int n = 0;
    static int max = 0;
    static char[][] candy;

    /*
    @Parameters
    int x1, y1 : 기존 좌표
    int x2, y2 : 바뀔 좌표
    */
    // 사탕 교체
    public static void swap(int x1, int y1, int x2, int y2) {
        char temp = candy[x1][y1];
        candy[x1][y1] = candy[x2][y2];
        candy[x2][y2] = temp;
    }

    // 최대 먹을 수 있는 사탕의 개수 체크
    public static void isMaximum() {

        // 행
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < n - 1; j++) {

                if (candy[i][j] == candy[i][j + 1])
                    count++;
                else
                    count = 1;

                // 사탕 최대 개수 저장
                max = Math.max(max, count);
            }
        }

        // 열
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < n - 1; j++) {
                if (candy[j][i] == candy[j + 1][i])
                    count++;
                else
                    count = 1;
                max = Math.max(max, count);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        candy = new char[n][n];

        for (int i = 0; i < n; i++) {
            candy[i] = br.readLine().toCharArray();
        }

        // 행
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                swap(i, j, i, j + 1);
                isMaximum();
                swap(i, j + 1, i, j);
            }
        }

        // 열
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                swap(i, j, i + 1, j);
                isMaximum();
                swap(i + 1, j, i, j);
            }
        }
        System.out.println(max);

    }

}
