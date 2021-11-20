package com.example.algorithm.part1;

import java.util.Scanner;

public class section3 {
    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;

        String [] strArr = str.split(" ");
        for(String s : strArr) {
            int len = s.length();
            if(len > max ) {
                max = len;
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        section3 se = new section3();

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(se.solution(str));
    }
}
