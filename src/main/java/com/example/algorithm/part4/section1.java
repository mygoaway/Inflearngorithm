package com.example.algorithm.part4;

import java.util.HashMap;
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

        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : map.keySet()) {
            int num = map.get(ch);
            if(num > max ){
                max = num;
                answer = ch;
            }
        }

        return answer;
    }
}
