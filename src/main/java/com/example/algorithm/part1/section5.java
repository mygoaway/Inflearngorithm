package com.example.algorithm.part1;

import java.util.ArrayList;
import java.util.Scanner;

public class section5 {
    public String solution(String str) {
        String answer = "";
        char [] charArr = str.toCharArray();
        int lt = 0;
        int rt = charArr.length - 1;
        while(lt < rt) {
            if(!Character.isAlphabetic(charArr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(charArr[rt])) {
                rt--;
            } else {
                char tmp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(charArr);
        return answer;
    }

    public static void main(String[] args) {
        section5 se = new section5();

        Scanner scan = new Scanner(System.in);
        String n = scan.next();

        System.out.println(se.solution(n));
    }
}
