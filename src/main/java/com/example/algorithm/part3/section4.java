package com.example.algorithm.part3;

import java.util.Scanner;

public class section4 {
    public static void main(String[] args) {
        section4 se1 = new section4();
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

        int lt = 0;
        for(int rt = 0; rt < a; rt++) {
            sum += intArr[rt];

            if(sum == b) {
                answer++;
            }

            while(sum > b) {
                sum -= intArr[lt];
                if(sum == b) {
                    answer++;
                }
                lt++;
            }
        }


        return answer;
    }
}
