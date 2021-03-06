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
            int num = intArr[i];
            int j = 0;
            for(j = i-1; j >= 0; j--) {
                if(intArr[j] > num) {
                    intArr[j+1] = intArr[j];
                } else {
                    break;
                }
            }
            intArr[j+1] = num;
        }
        return intArr;
    }
}
