package com.example.algorithm.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class section4 {
    public static void main(String[] args) {
        section4 se3 = new section4();
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();

        for(int x : se3.solution(cnt)) {
            System.out.print(x + " ");
        }
    }

    public int [] solution(int cnt) {
        int [] intArr = new int[cnt];

        intArr[0] = 1;
        intArr[1] = 1;
        for(int i = 2; i < cnt; i++) intArr[i] = intArr[i-1] + intArr[i-2];

        return intArr;
    }
}
