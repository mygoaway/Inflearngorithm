package com.example.algorithm.part3;

import java.util.Scanner;

public class section4 {
    public static void main(String[] args) {
        section4 se1 = new section4();
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
        int sum = 0;

        int lt = 0;
        for(int rt = 0; rt < intArrA.length; rt++) {
            sum += intArrA[rt];

            if(sum == b) {
                answer++;
            }

            while(sum > b) {
                sum -= intArrA[lt++];
                if(sum == b){
                    answer++;
                }
            }
        }

        return answer;
    }
}
