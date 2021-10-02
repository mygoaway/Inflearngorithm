package com.example.algorithm.part1;

import java.util.Scanner;
public class section2 {
    public String solution(String str) {
        String answer = "";

        for(int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)) {
                answer+= Character.toUpperCase(ch);
            } else {
                answer += Character.toLowerCase(ch);
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
