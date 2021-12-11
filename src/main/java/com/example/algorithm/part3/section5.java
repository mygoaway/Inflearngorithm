package com.example.algorithm.part3;

import java.util.Scanner;

public class section5 {
    public static void main(String[] args) {
        section5 se1 = new section5();
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        System.out.print(se1.solution(cnt));
    }

    public int solution(int cnt) {
        int answer = 0;
        int sum = 0;

        int num = cnt / 2 + 1;
        int [] intArr = new int[num];

        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = i+1;
        }

        int lt = 0;
        for(int rt = 0; rt < intArr.length; rt++) {
            sum += intArr[rt];

            if(sum == cnt) {
                answer++;
            }

            while(sum > cnt) {
                sum -= intArr[rt++];
                if(sum == cnt) {
                    answer++;
                }
            }
        }


        return answer;
    }
}
