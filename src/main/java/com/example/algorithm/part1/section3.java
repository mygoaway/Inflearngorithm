package com.example.algorithm.part1;

import java.util.Scanner;

public class section3 {
    public String solution(String str) {
        String answer = "";

        int m = Integer.MIN_VALUE;

        String [] strArr = str.split(" ");
        for(int i = 0; i < strArr.length; i++) {
            int len =  strArr[i].length();
            if(len > m) {
                m = len;
                answer = strArr[i];
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
