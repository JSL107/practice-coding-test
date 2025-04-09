package com.practice.codingtest.BOJ.PCCE;

import java.util.Scanner;

public class PG340205 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        while (number > 0) {
            answer = answer + number / 100;
            number = number % 100;
        }

        System.out.println(answer);
    }

}
