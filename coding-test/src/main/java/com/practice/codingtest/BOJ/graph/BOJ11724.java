package com.practice.codingtest.BOJ.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// NOTE :: 연결 요소의 개수
public class BOJ11724 {
    static int[][] graph = new int[1001][1001];
    static int N;
    static int M;
    static int count = 0;
    static boolean[] visited = new boolean[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken()) - 1;
            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                bfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            for (int i = 0; i < N; i++) {
                if (graph[tmp][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
