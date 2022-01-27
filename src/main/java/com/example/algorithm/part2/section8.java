package com.example.algorithm.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class section8 {
    public static void main(String[] args) {
        section8 se3 = new section8();
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int[] intArr = new int[cnt];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = scan.nextInt();
        }
        for (int x : se3.solution(cnt, intArr)) {
            System.out.print(x + " ");
        }
    }

    public List<Integer> solution(int cnt, int [] intArr) {
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < cnt; i++) {
            int num = 1;
            for(int j = 0; j < cnt; j++) {
                if(intArr[i] < intArr[j]) {
                    num++;
                }
            }
            answer.add(num);
        }

        return answer;
    }
}
