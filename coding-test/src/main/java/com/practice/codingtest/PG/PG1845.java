package com.practice.codingtest.PG;

import java.util.*;

public class PG1845 {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int value;

        for (int n : nums) {
            value = 0;
            if (map.containsKey(n)) {
                value += map.get(n);
                map.put(n, value);
            } else {
                map.put(n, 1);
            }
        }

        int answer = 0;
        for (int k : map.keySet()) {
            answer++;
        }
        return Math.min(answer, (nums.length) / 2);
    }
}
