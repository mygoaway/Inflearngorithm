package com.example.algorithm.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class section3 {
    public static void main(String[] args) {
        section3 se1 = new section3();
        Scanner scan = new Scanner(System.in);

        int cntA = scan.nextInt();
        int cntB = scan.nextInt();
        int [] intArrA = new int[cntA];
        for(int i = 0; i < intArrA.length; i++) {
            intArrA[i] = scan.nextInt();
        }

        System.out.print(se1.solution(cntA, cntB, intArrA));
    }

    public int solution(int a, int b, int [] intArrA) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < b - 1; i++) {
            sum += intArrA[i];
        }

        int lt = 0;
        for(int rt = b-1; rt < intArrA.length; rt++) {
            sum += intArrA[rt];
            if(sum > max) {
                max = sum;
                answer = max;
            }
            sum -= intArrA[lt++];
        }



        return answer;
    }
}
