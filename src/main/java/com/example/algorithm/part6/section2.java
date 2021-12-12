package com.example.algorithm.part6;

import java.util.Scanner;

// 버블정렬
public class section2 {
    public static void main(String[] args) {
        section2 se1 = new section2();
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
            for(int j = 0; j < cnt - 1 - i; j++) {
                if(intArr[j] > intArr[j+1]) {
                    int tmp = intArr[j];
                    intArr[j] = intArr[j+1];
                    intArr[j+1] = tmp;
                }
            }
        }

        return intArr;
    }
}
