package com.example.algorithm.part6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class section5 {
    public static void main(String[] args) {
        section5 se1 = new section5();
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        int [] intArr= new int[cnt];
        for(int i = 0; i < cnt; i++) intArr[i] = scan.nextInt();
        System.out.print(se1.solution(cnt, intArr));
    }

    public String solution(int cnt, int [] intArr) {
        String answer = "U";
        Arrays.sort(intArr);


        for(int i = 0; i < cnt-1; i++) {
            if(intArr[i] == intArr[i+1]) {
                return "D";
            }
        }
        return answer;
    }
}
