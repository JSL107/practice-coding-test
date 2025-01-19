package com.practice.codingtest.BOJ.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1652 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] room;

        int n = Integer.parseInt(br.readLine());
        room = new char[n][n];

        // I. 방만들기
        for (int i = 0; i < n; i++) {
            String t = br.readLine();
            for (int j = 0; j < n; j++) {
                room[i][j] = t.charAt(j);
            }
        }

        int rowCount = 0, colCount = 0;

        // II. 방 개수 카운트
        for (int i = 0; i < n; i++) {
            int count_h = 0;
            int count_v = 0;
            for (int j = 0; j < n; j++) {
                if (room[i][j] == '.') {
                    count_h++;
                } else {
                    // 연결된 공간이 있는지 체크
                    if (count_h > 1) {
                        rowCount++;
                    }
                    count_h = 0;
                }

                if (room[j][i] == '.') {
                    count_v++;
                } else {
                    if (count_v > 1) {
                        colCount++;
                    }
                    count_v = 0;
                }
            }
            if (count_h >= 2) {
                rowCount++;
            }

            if (count_v >= 2) {
                colCount++;
            }
        }
        System.out.println(rowCount + " " + colCount);

    }
}