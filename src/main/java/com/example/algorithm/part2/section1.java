package com.example.algorithm.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class section1 {
    public static void main(String[] args) {
        section1 se1 = new section1();
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int [] intArr = new int[cnt];
        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = scan.nextInt();
        }

        for(int x : se1.solution(cnt, intArr)){
            System.out.print(x + " ");
        }
    }

    public List<Integer> solution(int cnt, int [] intArr) {
        List<Integer> answer = new ArrayList<>();

        answer.add(intArr[0]);

        for(int i = 1; i < cnt; i++) {
            if(intArr[i] > intArr[i-1]) {
                answer.add(intArr[i]);
            }
        }

        return answer;
    }
}
