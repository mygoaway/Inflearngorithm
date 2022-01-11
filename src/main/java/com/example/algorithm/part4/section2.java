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

        for(char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(char ch : str2.toCharArray()) {
            if(!map.containsKey(ch) || map.get(ch) == 0) {
                return "NO";
            }
            map.put(ch, map.get(ch)-1);
        }


        return answer;
    }
}
