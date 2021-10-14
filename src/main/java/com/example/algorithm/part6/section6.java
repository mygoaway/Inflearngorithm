package com.example.algorithm.part6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class section6 {
    public static void main(String[] args) {
        section6 se1 = new section6();
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        int [] intArr= new int[cnt];
        for(int i = 0; i < cnt; i++) intArr[i] = scan.nextInt();
        for(int x : se1.solution(cnt, intArr)) {
            System.out.print(x+" ");
        }
    }

    public List<Integer> solution(int cnt, int [] intArr) {
        List<Integer> answer = new ArrayList<>();

        int [] tmp = intArr.clone();
        Arrays.sort(tmp);

        for(int i = 0; i < cnt; i++) {
            if(intArr[i] != tmp[i]) {
                answer.add(i+1);
            }
        }

        return answer;
    }
}
