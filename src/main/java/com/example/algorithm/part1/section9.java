package com.example.algorithm.part1;

import java.util.Scanner;

public class section9 {
    public int solution(String str) {
        String answer = "";

        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)) {
                answer += ch;
            }
        }

        int result = Integer.parseInt(answer);
        return result;
    }

    public static void main(String[] args) {
        section9 se = new section9();

        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();

        System.out.println(se.solution(n));
    }
}
