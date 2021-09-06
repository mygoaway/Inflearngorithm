package com.example.algorithm.part1;

import java.util.Scanner;

public class section3 {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE; // 정수의 최소값

        String[] strArr = str.split(" ");
        for(String x : strArr) {
            int len = x.length();
            if(len > m) {
                answer = x;
            }
        }

        int pos;
        while((pos=str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len1 = tmp.length();
            if(len1 > m) {
                m = len1;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if(str.length() > m) {
            answer = str;
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
