package com.example.algorithm.part1;

import java.util.Scanner;

public class section7 {
    public String solution(String str) {
        String answer ="NO";

        /*
        str = str.toUpperCase();
        int len = str.length();
        for(int i = 0; i < len/2; i++) {
            if(str.charAt(i) != str.charAt(len-i-1)) {
                return "NO";
            }
        }
        */

        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) {
            return "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        section7 se = new section7();

        Scanner scan = new Scanner(System.in);
        String n = scan.next();

        System.out.println(se.solution(n));
    }
}
