package com.example.algorithm.part1;

import java.util.Scanner;

public class section11 {
    public String solution(String str) {
        String answer = "";
        str = str +" ";
        int len = 1;

        char [] charArr = str.toCharArray();

        for(int i = 0; i < charArr.length - 1; i++) {
            if(charArr[i] == charArr[i+1]) {
                len++;
            } else {
                answer += charArr[i];
                if(len > 1) {
                    answer += len;
                }
                len=1;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        section11 se = new section11();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(se.solution(str));
    }
}
