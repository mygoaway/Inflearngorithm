package com.example.algorithm.part6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class section1 {
    public static void main(String[] args) {
        section1 se1 = new section1();
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        int [] intArr= new int[cnt];
        for(int i = 0; i < cnt; i++) intArr[i] = scan.nextInt();
        System.out.print(se1.solution(intArr));
    }

    public int [] solution(int [] intArr) {
        for(int i = 0; i < intArr.length - 1; i++) {
            int idx = i;
            for(int j = i+1; j < intArr.length; j++) {
                if(intArr[j] < intArr[idx]) {
                    idx = j;
                }
            }
            int tmp = intArr[i];
            intArr[i] = intArr[idx];
            intArr[idx] = tmp;
        }

        return intArr;
    }
}
