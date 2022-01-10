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

        return answer;
    }
}
