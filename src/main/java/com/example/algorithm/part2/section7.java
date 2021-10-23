package com.example.algorithm.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class section7 {
    public static void main(String[] args) {
        section7 se3 = new section7();
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int[] intArr = new int[cnt];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = scan.nextInt();
        }
        System.out.println(se3.solution(cnt, intArr));
    }

    public int solution(int cnt, int [] intArr) {
        int sum = 0, num = 0;

        for(int x : intArr) {
            if( x == 1) {
                num++;
                sum += num;
            } else {
                num = 0;
            }
        }

        return sum;
    }
}
