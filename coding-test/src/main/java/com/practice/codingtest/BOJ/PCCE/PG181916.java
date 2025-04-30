package com.practice.codingtest.BOJ.PCCE;

import java.util.HashMap;

// a	b	c	d	result
// 2	2	2	2	2222
// 4	1	4	4	1681 => 2
// 6	3	3	6	27 = 2
// 2	5	2	6	30
// 6	4	2	5	2
public class PG181916 {
    public static void main(String[] args) {
//        int a = 2, b = 2, c = 2, d = 2;
        int a = 6;
        int b = 3;
        int c = 3;
        int d = 6;
        solution(a, b, c, d);
    }

    static HashMap<Integer, Integer> dice = new HashMap<>();
    static int minValue = Integer.MAX_VALUE;

    // NOTE :: 주사위 개수 구하는 함수
    public static void diceCompare(int[] diceArray) {
        for (int j : diceArray) {
            int count = 1;
            if (dice.containsKey(j)) {
                count += dice.get(j);
            }
            minValue = Math.min(minValue, j);
            dice.put(j, count);
        }
    }

    public static int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] diceArray = new int[4];
        diceArray[0] = a;
        diceArray[1] = b;
        diceArray[2] = c;
        diceArray[3] = d;
        diceCompare(diceArray);

        switch (dice.keySet().size()) {
            case 1: // 모두 같은 경우 (1111 * p)
                answer = 1111 * minValue;
                break;
            case 2:
                int p = 0, q = 0;
                for (int j : dice.keySet()) {
                    if (dice.get(j) == 3) { // 세 주사위 같음(p), 다른 하나 (q)인 경우 (10 * p + q)^2 (2)
                        p = j;
                    } else if (dice.get(j) == 1) {
                        q = j;
                    }
                    answer = (int) Math.pow((10 * p + q), 2);
                }
                if (answer == 0) {
                    for (int j : dice.keySet()) {
                        if (dice.get(j) == 2 && j != minValue) { // 주사위가 두 개씩 같은 값이 나온 경우
                            p = j;
                        } else {
                            q = j;
                        }
                        answer = (p + q) * Math.abs(p - q);
                    }
                }
                break;
            case 3: // 두 주사위만 같고 각 각 나온 경우
                int t = 1;
                int key = 0;
                for (int j : dice.keySet()) {
                    if (dice.get(j) == 2) {
                        key = j;
                    }
                }
                dice.remove(key);

                for (int j : dice.keySet()) {
                    t *= j;
                }

                answer = t;
                break;

            case 4: // 모두 다른 경우
                answer = minValue;
                break;
        }

        return answer;
    }
}
