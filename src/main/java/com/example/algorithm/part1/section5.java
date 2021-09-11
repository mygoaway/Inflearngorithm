package com.example.algorithm.part1;

import java.util.ArrayList;
import java.util.Scanner;

public class section5 {
    public String solution(String str) {
        String answer ="";

        char[] charArray = str.toCharArray();
        int lt = 0;
        int rt = charArray.length - 1;

        while (lt < rt) {
            if(!Character.isAlphabetic(charArray[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(charArray[rt])) {
                rt--;
            } else {
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        section5 se = new section5();

        Scanner scan = new Scanner(System.in);
        String n = scan.next();

        System.out.println(se.solution(n));
    }
}
