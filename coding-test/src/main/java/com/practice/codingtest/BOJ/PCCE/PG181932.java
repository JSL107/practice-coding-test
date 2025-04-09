package com.practice.codingtest.BOJ.PCCE;

// TODO :: IDX 짝수/홀수 여부 => MODE(0) => idx(짝수) = > 글자 추가 or MODE(1) => idx(홀수) => 글자 추가, CASE :: ret이 빈 문자열 : EMPTY
public class PG181932 {
    public static void main(String[] args) {
        String s = solution("abc1abc1abc");
        System.out.println(s);
    }

    public static String solution(String code) {
        char[] cCode = code.toCharArray();
        boolean mode = false;
        StringBuilder ret = new StringBuilder();

        for (int idx = 0; idx < cCode.length; idx++) {
            if (cCode[idx] == '1') {
                mode = !mode;
                continue;
            }
            if (!mode && idx % 2 == 0) {
                ret.append(cCode[idx]);
            } else if (mode && idx % 2 != 0) {
                ret.append(cCode[idx]);
            }
        }

        return ret.isEmpty() ? "EMPTY" : ret.toString();
    }
}