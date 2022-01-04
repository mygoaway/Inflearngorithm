package com.example.algorithm.part1;

import java.util.Locale;
import java.util.Scanner;

public class section1 {
    public int solution(String str, char t) {
        int answer = 0;

        str = str.toLowerCase();
        for(char ch : str.toCharArray()) {
            if(ch == t) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        section1 se = new section1();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);
        System.out.println(se.solution(str, c));
    }
}
