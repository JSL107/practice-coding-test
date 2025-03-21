package com.practice.codingtest.BOJ.PCCE;

public class PG181943 {
    public static void main(String[] args) {
        String my_string = "Program29b8UYP";
        String overwrite_string = "merS123";
        int s = 7;
        solution(my_string, overwrite_string, s);
    }
    public static String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s; i++) {
            sb.append(my_string.charAt(i));
        }
        sb.append(overwrite_string);

        for(int i = sb.toString().length(); i < my_string.length(); i++) {
            sb.append(my_string.charAt(i));
        }

        return sb.toString();
    }

}
