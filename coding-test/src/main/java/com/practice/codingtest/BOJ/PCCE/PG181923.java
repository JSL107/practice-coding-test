package com.practice.codingtest.BOJ.PCCE;

// 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
//
// NOTE :: 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
//
// 각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
// 단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.



import java.util.ArrayList;

public class PG181923 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}}; //[3, 4, -1]
        solution(arr, queries);
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int temp;
        ArrayList<Integer> al = new ArrayList<>();
        int s, e, k;
        for (int i = 0; i < queries.length; i++) {
            for (int j = 2; j < queries[i].length; j++) {
                s = arr[queries[i][j - 2]];
                System.out.println(s);
                e = arr[queries[i][j - 1]];
                System.out.println(e);
                k = arr[queries[i][j]];
                System.out.println(k);
                if (s <= arr[s] && e >= arr[s]) {
                    System.out.println("now :: " + arr[queries[i][s]]);
                    if (arr[queries[i][s]] > k) {
                        System.out.println(arr[queries[i][s]]);
//                        Math.min(queries[i][])
                    }
                }
            }
        }
        return arr;
    }
}
