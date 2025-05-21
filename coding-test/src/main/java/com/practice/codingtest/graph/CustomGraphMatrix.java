package com.practice.codingtest.graph;

import java.util.Arrays;
import java.util.Objects;

public class CustomGraphMatrix {
    // 정점의 수
    private final int size;
    // 1차원 배열 사용 여부 (true: 1차원 사용, false: 2차원 사용)
    private final boolean useOneDimension;
    // 1차원 배열에 펼친 인접 행렬 (n*n 크기)
    private final boolean[] flatMatrix;
    // 2차원 배열 형태의 인접 행렬 (n x n)
    private final boolean[][] matrix;

    public CustomGraphMatrix(int size, boolean useOneDimension) {
        this.size = size;
        this.useOneDimension = useOneDimension;
        if (useOneDimension) {
            // 1차원 배열로 n*n 크기의 인접 행렬 생성
            flatMatrix = new boolean[size * size];
            matrix = null;
        } else {
            // 2차원 배열로 n x n 크기의 인접 행렬 생성
            flatMatrix = null;
            matrix = new boolean[size][size];
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
     * 무방향 그래프 간선을 추가
     * @param u 정점 u
     * @param v 정점 v
     */
    public void addEdge(int u, int v) {
        // 입력 정점 번호 유효성 검사
        validateVertex(u);
        validateVertex(v);
        // 내부 배열에 간선 정보 설정
        setEdge(u, v, true);
    }

    public void removeEdge(int u, int v) {
        validateVertex(u);
        validateVertex(v);
        setEdge(u, v, false);
    }

    /**
     * 인접 행렬에 간선 값을 설정
     *
     * @param u 정점 u
     * @param v 정점 v
     */
    private void setEdge(int u, int v, boolean value) {
        if (useOneDimension) {
            boolean[] m = Objects.requireNonNull(flatMatrix, "flatMatrix is null");
            m[u * size + v] = value;
            m[v * size + u] = value;
        } else {
            boolean[][] mat = Objects.requireNonNull(matrix, "matrix is null");
            mat[u][v] = value;
            mat[v][u] = value;
        }
    }

    /**
     * 현재 인접 행렬 상태를 문자열로 반환
     * @return 1차원 또는 2차원 배열 형태로 출력된 행렬 문자열
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (useOneDimension) {
            sb.append("1차원 행렬:\n")
                    .append(Arrays.toString(flatMatrix))
                    .append(System.lineSeparator())
                    .append("행렬 길이: ").append(flatMatrix.length);
        } else {
            sb.append("2차원 행렬 (행 개수 = ").append(matrix.length)
                    .append(", 열 개수 = ").append(matrix[0].length).append(")\n");
            // 각 행을 문자열로 표현
            for (int i = 0; i < size; i++) {
                sb.append("행 ").append(i).append(": ")
                        .append(Arrays.toString(matrix[i]))
                        .append(System.lineSeparator());
            }
        }
        return sb.toString();
    }


    /**
     * 예제 실행 메서드
     * - addEdge() 후 removeEdge() 호출로 간선 추가/제거 시나리오 시연
     */
    public static void main(String[] args) {
        // 1차원 배열 사용 예시
        CustomGraphMatrix g1 = new CustomGraphMatrix(4, true);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 3);
        System.out.println("=== addEdge() 호출 후 ===");
        System.out.println(g1);

        g1.removeEdge(0, 2);
        System.out.println("=== removeEdge(0,2) 호출 후 ===");
        System.out.println(g1);

        // 2차원 배열 사용 예시
        CustomGraphMatrix g2 = new CustomGraphMatrix(4, false);
        g2.addEdge(0, 1);
        g2.addEdge(0, 2);
        g2.addEdge(1, 3);
        System.out.println("=== addEdge() 호출 후 ===");
        System.out.println(g2);

        g2.removeEdge(0, 2);
        System.out.println("=== removeEdge(0,2) 호출 후 ===");
        System.out.println(g2);
    }
}