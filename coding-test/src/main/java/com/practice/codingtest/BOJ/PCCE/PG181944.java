package com.practice.codingtest.BOJ.PCCE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PG181944 {    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    if(num % 2 == 0) {
        System.out.printf("%d is even", num);
    } else {
        System.out.printf("%d is odd", num);
    }
}

}
