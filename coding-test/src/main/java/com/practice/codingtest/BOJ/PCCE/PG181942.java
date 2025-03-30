package com.practice.codingtest.BOJ.PCCE;

public class PG181942 {

        public String solution(String str1, String str2) {
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < str1.length() + str2.length(); i++){
                if(i % 2 == 0) {
                    sb.append(str1.charAt(i/2));
                } else {
                    sb.append(str2.charAt(i/2));
                }
            }
            return sb.toString();
        }
    }

