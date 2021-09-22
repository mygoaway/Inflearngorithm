package com.example.algorithm.part2;

import java.util.Scanner;

public class section11 {
    public static void main(String[] args) {
        section11 se3 = new section11();
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int[][] intArr = new int[cnt+1][6];
        for (int i = 1; i < intArr.length; i++) {
            for (int j = 1; j < intArr.length; j++){
                intArr[i][j] = scan.nextInt();
            }
        }
        System.out.println(se3.solution(cnt, intArr));
    }


    public int solution(int cnt, int [][] intArr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 1; i <= cnt; i++) {
            int num = 0;
            for(int j = 1; j <= cnt; j++) {
                for(int k = 1; k <=5; k++) {
                    if(intArr[i][k] == intArr[j][k]) {
                        num++;
                        break;
                    }
                }
            }
            if(num > max) {
                max = num;
                answer = i;
            }
        }
        return answer;
    }


}
