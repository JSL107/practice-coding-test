package com.practice.codingtest.소수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine()); // 시작 값
        int N = Integer.parseInt(br.readLine()); // 끝나는 값

        int hap = 0;
        int min = Integer.MAX_VALUE;
        boolean[] result = isPrime(N);
        for (int i = M; i < result.length; i++) {
            if (result[i]) {
                hap += i;
                if (min == Integer.MAX_VALUE) {
                    min = i;  // 첫 번째 소수를 찾으면 min에 설정
                }
            }
        }
        if (hap == 0) {
            System.out.println(-1); // 소수가 없으면 -1 출력
        } else {
            System.out.println(hap);  // 소수들의 합 출력
            System.out.println(min);  // 가장 작은 소수 출력
        }
    }

    public static boolean[] isPrime(int end) {
        boolean[] prime = new boolean[end + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i <= Math.sqrt(end); i++) { // 2부터 n의 제곱근까지의 모든 수를 확인
            if (prime[i]) { // 해당수가 소수라면, 해당수를 제외한 배수들을 모두 false 처리하기
                for (int j = i * i; j <= end; j += i) {//그 이하의 수는 모두 검사했으므로 i*i부터 시작
                    prime[j] = false;
                }
            }
        }
        return prime;

    }
}
