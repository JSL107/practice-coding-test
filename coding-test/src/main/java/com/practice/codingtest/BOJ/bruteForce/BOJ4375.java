package com.practice.codingtest.BOJ.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// NOTE :: 1
public class BOJ4375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            int num = Integer.parseInt(input);
            int mod = 0;

            for(int i = 1;;i++){
                // 1로만 이뤄진 숫자 제작 1. 11. 111 ....
                // 입력 숫자 나눈 로 나머지가 0 이면 출력
                mod = (mod*10+1)%num;
                if(mod == 0) {
                    System.out.println(i);
                    break;
                }
            }

        }
    }

}
