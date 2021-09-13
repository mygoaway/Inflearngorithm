package com.example.algorithm.part2;

import java.util.Scanner;

public class section5 {
    public static void main(String[] args) {
        section5 se3 = new section5();
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();

        System.out.println(se3.solution(cnt));
    }

    public int solution(int cnt) {
        int answer = 0;

        int [] intArr = new int[cnt+1];
        for(int i = 2; i <= cnt; i++) {
            if(intArr[i] == 0) {
                answer++;
                for(int j = i; j <= cnt; j = j + i) {
                    intArr[j] = 1;
                }
            }
        }


        return answer;
    }
}
