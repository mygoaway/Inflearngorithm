package com.example.algorithm.part1;

import java.util.Scanner;

public class section6 {
    public String solution(String str) {
        String answer ="";

        for(int i = 0 ; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        section6 se = new section6();

        Scanner scan = new Scanner(System.in);
        String n = scan.next();

        System.out.println(se.solution(n));
    }
}
