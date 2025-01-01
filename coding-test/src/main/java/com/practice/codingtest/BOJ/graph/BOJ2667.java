package com.practice.codingtest.BOJ.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2667 {
    static int[][] house;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> complexSizes = new ArrayList<>();
        house = new int[n + 1][n + 1];
        visited = new boolean[n + 1][n + 1];
        
        // 방문 여부와 map에 데이터 담기
        for (int i = 0; i < n; i++) {
            String st = br.readLine();
            String[] arr = st.split("");
            for (int j = 0; j < n; j++) {
                int input = Integer.parseInt(arr[j]);
                house[i][j] = input;
                if (input == 0) {
                    visited[i][j] = true;
                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && house[i][j] == 1) {
                    complexSizes.add(bfs(i, j));
                }
            }
        }
        System.out.println(complexSizes.size());
        Collections.sort(complexSizes);
        for (int a : complexSizes) {
            System.out.println(a);
        }
    }

    // 넓이 우선 탐색을 진행하면서 Queue에 담으며 모두 방문하기
    public static int bfs(int sx, int sy) {
        q.offer(new int[]{sx, sy});
        visited[sx][sy] = true;
        int houseCount = 1;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && ny >= 0 && nx < house.length && ny < house[0].length) {
                    if (!visited[nx][ny] && house[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        q.offer(new int[]{nx, ny}); // 큐에 새로운 집을 넣기
                        houseCount++; // 집 개수 증가
                    }
                }
            }
        }
        return houseCount;
    }
}
