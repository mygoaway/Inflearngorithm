package com.example.algorithm.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class section9 {
    public static void main(String[] args) {
        section9 se3 = new section9();
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int[][] intArr = new int[cnt][cnt];
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr.length; j++){
                intArr[i][j] = scan.nextInt();
            }
        }
        System.out.println(se3.solution(cnt, intArr));
    }

    public int solution(int cnt, int [][] intArr) {
        int answer = Integer.MIN_VALUE;
        int answer1 = 0;
        int answer2 = 0;

        for(int i = 0; i < cnt; i++) {
            answer1 = 0;
            answer2 = 0;
            for(int j = 0; j < cnt; j++) {
                answer1 += intArr[i][j];
                answer2 += intArr[j][i];
            }

            answer = Integer.max(answer, answer1);
            answer = Integer.max(answer, answer2);
        }

        answer1 = 0;
        answer2 = 0;

        for(int i = 0; i < cnt; i++) {
            answer1 += intArr[i][i];
            answer2 += intArr[i][5-i-1];
        }
        answer = Integer.max(answer, answer1);
        answer = Integer.max(answer, answer2);

        return answer;
    }
}
