package com.example.algorithm.part6;

import java.util.Scanner;

// 삽입정렬
public class section3 {
    public static void main(String[] args) {
        section3 se1 = new section3();
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        int [] intArr= new int[cnt];
        for(int i = 0; i < cnt; i++) intArr[i] = scan.nextInt();
        for(int x : se1.solution(cnt, intArr)) {
            System.out.print(x+" ");
        }
    }

    public int [] solution(int cnt, int [] intArr) {

        for(int i = 1; i < cnt; i++) {
            int tmp = intArr[i];
            int k = 0;
            for(k = i - 1; k >= 0; k--) {
                if(intArr[k] > tmp) {
                    intArr[k+1] = intArr[k];
                } else {
                    break;
                }
            }
            intArr[k+1] = tmp;
        }

        return intArr;
    }
}
