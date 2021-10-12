package com.example.algorithm.part6;

import java.util.Scanner;

public class section2 {
    public static void main(String[] args) {
        section2 se1 = new section2();
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        int [] intArr= new int[cnt];
        for(int i = 0; i < cnt; i++) intArr[i] = scan.nextInt();
        for(int x : se1.solution(intArr)) {
            System.out.print(x+" ");
        }
    }

    public int [] solution(int [] intArr) {
        for(int i = 0; i < intArr.length - 1; i++){
            for(int j = 0; j < intArr.length - 1 - i; j++) {
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
