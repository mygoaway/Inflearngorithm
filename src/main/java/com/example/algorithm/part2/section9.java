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
        int sum1 = 0; // 행의 합
        int sum2 = 0; //

        for (int i = 0; i < intArr.length; i++) {
            sum1=sum2=0;
            for (int j = 0; j < intArr.length; j++){
                sum1 += intArr[i][j];
                sum2 += intArr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for(int i = 0; i < intArr.length; i++) {
            sum1+=intArr[i][i];
            sum2+=intArr[i][5-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }
}
