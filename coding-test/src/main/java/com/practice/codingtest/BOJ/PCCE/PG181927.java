package com.practice.codingtest.BOJ.PCCE;

public class PG181927 {
    // 그 전 원소보다 크면 -, 그전 원소보다 크지 X 마지막원소 두배한 값
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int one = num_list[num_list.length - 1];
        int two = num_list[num_list.length - 2];
        // 얕은, 깊은 복사를 했더니 길이가 바뀜.
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        if (one > two) {
            answer[answer.length - 1] = one - two;
        } else {
            answer[answer.length - 1] = one * 2;
        }

        return answer;
    }
}
