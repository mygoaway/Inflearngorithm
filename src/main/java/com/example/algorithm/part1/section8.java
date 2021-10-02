package com.example.algorithm.part1;

import java.util.Scanner;

public class section8 {
    public String solution(String str) {
        String answer ="NO";

        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equals(tmp)) {
            answer = "YES";
        }


        return answer;
    }

    public static void main(String[] args) {
        section8 se = new section8();

        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();

        System.out.println(se.solution(n));
    }
}
