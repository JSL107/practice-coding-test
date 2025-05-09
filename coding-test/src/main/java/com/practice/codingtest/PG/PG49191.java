package com.practice.codingtest.PG;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PG49191 {
    static boolean[] visited;

    public static void main(String[] args) {
        int n = 5;
        int[][] results = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};
        int t = solution(n, results); // return 2
        System.out.println(t);
    }

    public static int solution(int n, int[][] results) {
        List<Integer>[] winGraph = new List[n + 1];     // winner → loser
        List<Integer>[] loseGraph = new List[n + 1];   // loser → winner (역방향)

        // 인접 리스트 초기화
        for (int i = 1; i <= n; i++) {
            winGraph[i] = new ArrayList<>();
            loseGraph[i] = new ArrayList<>();
        }

        // 노드 추가
        for (int[] r : results) {
            int w = r[0], l = r[1];
            winGraph[w].add(l); // 승자 그래프
            loseGraph[l].add(w); // 패자 그래프
        }

        int answer = 0;

        // 각 선수마다 winCount, loseCount 계산
        for (int i = 1; i <= n; i++) {
            int winCount = bfs(i, winGraph, n);
            int loseCount = bfs(i, loseGraph, n);
            if (winCount + loseCount == n - 1) { // 승패 합에 대한 간선이 n-1과 같다면 순위가 정해진 것
                answer++;
            }
        }
        return answer;
    }


    public static int bfs(int start, List<Integer>[] graph, int n) {
        Queue<Integer> q = new LinkedList<>();
        visited = new boolean[n + 1];

        q.offer(start);
        visited[start] = true;

        int count = 0;
        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int next : graph[cur]) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.offer(next);
                    count++;
                }
            }
        }
        return count;
    }
}
