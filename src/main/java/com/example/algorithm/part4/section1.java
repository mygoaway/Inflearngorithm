package com.example.algorithm.part4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class section1 {
    public static void main(String[] args) {
        section1 se1 = new section1();
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        String str = scan.next();

        System.out.print(se1.solution(cnt, str));
    }

    public char solution(int cnt, String str) {
        char answer = ' ';
        int max = Integer.MIN_VALUE;

        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        for(char key : map.keySet()) {
            // System.out.println(key + " " + map.get(key));
            if(map.get(key) > max)  {
                max = map.get(key);
                answer = key;
            }
        }


        return answer;
    }
}
