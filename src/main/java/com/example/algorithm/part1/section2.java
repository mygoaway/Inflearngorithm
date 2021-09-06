package com.example.algorithm.part1;

import java.util.Scanner;
public class section2 {
    public String solution(String str) {
        String answer = "";

        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }

        for(char x : str.toCharArray()) {
            if(x>=97 && x<=122) {
                answer += (char)(x-32);
            } else {
                answer += (char)(x+32);
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
