package com.practice.codingtest.BOJ.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BOJ1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        ArrayList<String> list = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n + m; i++) {
            String name = br.readLine();
            try {
                if (map.containsKey(name)) {
                    map.put(name, 0);
                } else {
                    map.put(name, 1);
                }
            } catch (Exception e) {
            }
        }

        for (String s : map.keySet()) {
            if (map.get(s) == 0) {
                list.add(s);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}