package com.example.algorithm.part4;

import java.util.HashMap;
import java.util.Scanner;

public class section2 {
    public static void main(String[] args) {
        section2 se1 = new section2();
        Scanner scan = new Scanner(System.in);

        String str1 = scan.next();
        String str2 = scan.next();

        System.out.print(se1.solution(str1, str2));
    }

    public String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : str1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(char x : str2.toCharArray()) {
            if(!map.containsKey(x) || map.get(x) == 0) {
                answer ="NO";
            }
            map.put(x, map.get(x)-1);
        }

        
        return answer;
    }
}
