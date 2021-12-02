package com.example.algorithm.part6;

import java.util.Scanner;


public class section4 {
    public static void main(String[] args) {
        section4 se1 = new section4();
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int cnt = scan.nextInt();
        int [] intArr= new int[cnt];
        for(int i = 0; i < cnt; i++) intArr[i] = scan.nextInt();
        for(int x : se1.solution(size, cnt, intArr)) {
            System.out.print(x+" ");
        }
    }

    public int [] solution(int size, int cnt, int [] intArr) {
        int [] cache = new int[size];

        for(int x : intArr) {
            int pos = -1;
            for(int i = 0; i < size; i++) {
                if(cache[i] == x) {
                    pos = i;
                }
            }

            if(pos == -1) {
                for(int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i-1];
                }
            } else {
                for(int i = pos; i >= 1; i--) {
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }

        return cache;
    }
}
