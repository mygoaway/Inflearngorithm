package com.example.algorithm.part1;

import java.util.Scanner;

public class section9 {
    public int solution(String str) {
        String answer = "";

        char [] charArr = str.toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            if(Character.isDigit(charArr[i])) {
                answer += charArr[i];
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
