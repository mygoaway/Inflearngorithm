package com.example.algorithm.part6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

// 선택정렬
public class section1 {
    public static void main(String[] args) {
        section1 se1 = new section1();
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        int [] intArr= new int[cnt];
        for(int i = 0; i < cnt; i++) intArr[i] = scan.nextInt();
        for(int x : se1.solution(cnt, intArr)) {
            System.out.print(x+" ");
        }
    }

    public int [] solution(int cnt, int [] intArr) {
        for(int i = 0; i < cnt - 1; i++) {
            int idx = i;
            for(int j = i+1; j < cnt; j++) {
                if(intArr[idx] > intArr[j]) {
                    idx = j;
                }
            }
            int num = intArr[i];
            intArr[i] = intArr[idx];
            intArr[idx] = num;
        }

        return intArr;
    }
}
