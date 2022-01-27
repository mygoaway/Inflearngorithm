package com.example.algorithm.part1;

import java.util.Scanner;

public class section10 {
    public int [] solution(String str, char ch) {
        int [] intArr = new int[str.length()];
        int answer = 0;

        char [] charArr = str.toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] == ch) {
                answer = 0;
                intArr[i] = answer;
            } else {
                answer++;
                intArr[i] = answer;
            }
        }
        answer = 0;

        for(int i = charArr.length - 1; i >= 0; i--) {
            if(charArr[i] == ch) {
                answer = 0;
            } else {
                answer++;
                intArr[i] = Math.min(intArr[i],answer);
            }
        }

        return intArr;
    }

    public static void main(String[] args) {
        section10 se = new section10();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char ch = scan.next().charAt(0);

        for(int x : se.solution(str, ch)) {
            System.out.print(x + " ");
        };
    }
}
