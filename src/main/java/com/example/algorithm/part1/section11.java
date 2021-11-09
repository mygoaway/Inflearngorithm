package com.example.algorithm.part1;

import java.util.Scanner;

public class section11 {
    public String solution(String str) {
        String answer = "";

        int num = 1;
        str = str + " ";

        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                num++;
            } else {
                answer += str.charAt(i);
                if(num > 1) {
                    answer += num;
                }
                num = 1;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        section11 se = new section11();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(se.solution(str));
    }
}
