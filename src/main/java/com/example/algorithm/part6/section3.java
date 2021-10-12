package com.example.algorithm.part6;

import java.util.Scanner;

public class section3 {
    public static void main(String[] args) {
        section3 se1 = new section3();
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        int [] intArr= new int[cnt];
        for(int i = 0; i < cnt; i++) intArr[i] = scan.nextInt();
        for(int x : se1.solution(intArr)) {
            System.out.print(x+" ");
        }
    }

    public int [] solution(int [] intArr) {
        for(int i = 1; i < intArr.length; i++) {
            int tmp = intArr[i];
            int j = 0;
            for(j = i - 1; j >= 0; j--) {
                if(intArr[j] > tmp) {
                    intArr[j+1] = intArr[j];
                } else {
                    break;
                }
            }
            intArr[j+1] = tmp;
        }

        return intArr;
    }
}
