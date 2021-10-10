package com.example.algorithm.part1;

import java.util.Scanner;
public class section2 {
    public String solution(String str) {
        String answer = "";

        for(int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))) {
                answer += Character.toUpperCase(str.charAt(i));
            } else {
                answer += Character.toLowerCase(str.charAt(i));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        section2 se = new section2();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(se.solution(str));
    }

}
