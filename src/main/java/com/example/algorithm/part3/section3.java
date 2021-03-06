package com.example.algorithm.part3;

import java.util.Scanner;

public class section3 {
    public static void main(String[] args) {
        section3 se1 = new section3();
        Scanner scan = new Scanner(System.in);

        int cntA = scan.nextInt();
        int cntB = scan.nextInt();
        int [] intArr = new int[cntA];
        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = scan.nextInt();
        }

        System.out.print(se1.solution(cntA, cntB, intArr));
    }

    public int solution(int a, int b, int [] intArr) {
        int answer = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < b-1; i++) {
            sum += intArr[i];
        }

        int lt = 0;
        for(int rt = b-1; rt < a; rt++) {
            sum += intArr[rt];
            if(sum > max) {
                max = sum;
                answer = max;
            }
            sum -= intArr[lt];
            lt++;
        }

        return answer;
    }
}
