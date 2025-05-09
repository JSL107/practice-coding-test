package com.practice.codingtest.PG;

import java.util.*;

// QUESTION :: 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다. (모든 케이스를 해야함)
//  1. 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록
public class PG42577 {
    public static void main(String[] args) {
        String[] phonebook1 = {"119", "97674223", "1195524421"};
        String[] phonebook2 = {"123", "456", "789"};
        String[] phonebook3 = {"12", "123", "1235", "567", "88"};
//        System.out.println(phonebook1);
        boolean answer = solution(phonebook2);
        System.out.println(answer);

    }

    public static boolean solution(String[] phone_book) {

        Map<String, Boolean> map = new HashMap<>(phone_book.length);
        for (String num : phone_book) {
            map.put(num, Boolean.TRUE);
        }

        // 번호 마다 모든 접두사 생성
        for (String num : phone_book) {
            for (int len = 1; len < num.length(); len++) {
                String prefix = num.substring(0, len);
                System.out.println(prefix);
                if (map.containsKey(prefix)) {
                    return false;
                }
            }
        }
        return true;

    }
}
