package com.practice.codingtest.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * 무방향 그래프를 인접 리스트로 표현하는 클래스
 */
public class CustomGraphList {
    // 정점의 수
    private final int size;
    // 각 정점별 인접 리스트
    private final List<List<Integer>> adjList;

    /**
     * 생성자
     * @param size 정점의 총 개수
     */
    public CustomGraphList(int size) {
        this.size = size;
        this.adjList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            // 각 정점마다 빈 리스트 생성
            adjList.add(new ArrayList<>());
        }
    }

    /**
     * 정점 번호 유효성 검사
     * @param v 검사할 정점 번호
     * @throws IndexOutOfBoundsException 범위를 벗어나면 예외 발생
     */
    private void validateVertex(int v) {
        if (v < 0 || v >= size) {
            throw new IndexOutOfBoundsException("정점 번호가 범위를 벗어났습니다: " + v);
        }
    }

    /**
     * 무향 그래프 간선을 추가
     * @param u 정점 u
     * @param v 정점 v
     */
    public void addEdge(int u, int v) {
        validateVertex(u);
        validateVertex(v);
        // 중복 추가 방지
        if (!adjList.get(u).contains(v)) {
            adjList.get(u).add(v);
        }
        if (!adjList.get(v).contains(u)) {
            adjList.get(v).add(u);
        }
    }

    /**
     * 무향 그래프 간선을 제거
     * @param u 정점 u
     * @param v 정점 v
     */
    public void removeEdge(int u, int v) {
        validateVertex(u);
        validateVertex(v);
        adjList.get(u).remove((Integer) v);
        adjList.get(v).remove((Integer) u);
    }

    /**
     * 현재 인접 리스트 상태를 문자열로 반환
     * @return 각 정점별 연결된 이웃 리스트
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(i).append(" -> ")
                    .append(adjList.get(i))
                    .append(System.lineSeparator());
        }
        return sb.toString();
    }

    /**
     * 예제 실행 메서드
     * - addEdge(), removeEdge() 후 인접 리스트 출력
     */
    public static void main(String[] args) {
        CustomGraphList graph = new CustomGraphList(4);

        // 간선 추가 시나리오
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        System.out.println("=== addEdge() 호출 후 ===");
        System.out.println(graph);

        // 간선 제거 시나리오
        graph.removeEdge(0, 2);
        System.out.println("=== removeEdge(0,2) 호출 후 ===");
        System.out.println(graph);
    }
}
