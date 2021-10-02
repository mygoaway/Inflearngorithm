package com.example.algorithm.part1;

import java.util.Scanner;

public class section10 {
    public int [] solution(String str, char ch) {
        int [] intArr = new int[str.length()];

        int num = 1000;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                num = 0;
                intArr[i] = num;
            } else {
                num ++;
                intArr[i] = num;
            }
        }

        num = 1000;
        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == ch) {
                num = 0;
            } else {
                num ++;
                intArr[i] = Math.min(intArr[i], num);
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
