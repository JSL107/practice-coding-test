package com.practice.codingtest.BOJ.priorityQueue;

import java.io.*;
import java.util.PriorityQueue;
import java.util.Collections;

/*
@Parameter
1. int n : 총 외칠 숫자의 개수
2. int say : 백준이가 외친 숫자
*/
public class BOJ1655 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine());
        int say;
        for (int i = 0; i < n; i++) {
            say = Integer.parseInt(br.readLine());

            isMaxHeap(say, maxHeap, minHeap);
        }
        System.out.println(sb.toString());

    }

    /*
    @Parameter
    1. PriorityQueue<Integer> maxHeap : 백준이가 부른 숫자 중 작은 수들
    2. PriorityQueue<Integer> minHeap : 백준이가 부른 숫자 중 큰 수들

    isMaxHeap() : maxHeap의 Top이 전체 부른 숫자들 중 중간값에 위치 한다.
    */
    public static void isMaxHeap(int say, PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
        if (maxHeap.size() == minHeap.size()) {
            maxHeap.add(say); // 작은 수를 역정렬해서 대입
        } else {
            minHeap.add(say); // 큰 수를 정렬해서 대입
        }

        // maxHeap에 있는 수가 minHeap에 있는 수보다 작으면 치환
        if (!maxHeap.isEmpty() && !minHeap.isEmpty()) {
            if (maxHeap.peek() > minHeap.peek()) {
                maxHeap.add(minHeap.poll());
                minHeap.add(maxHeap.poll());
            }
        }
        sb.append(maxHeap.peek()).append("\n");
    }
}
