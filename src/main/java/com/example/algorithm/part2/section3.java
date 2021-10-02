package com.example.algorithm.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class section3 {
    public static void main(String[] args) {
        section3 se3 = new section3();
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int [] aArr = new int[cnt];
        int [] bArr = new int[cnt];

        for(int i = 0; i < aArr.length; i++) {
            aArr[i] = scan.nextInt();
        }
        for(int i = 0; i < bArr.length; i++) {
            bArr[i] = scan.nextInt();
        }

        for(String x : se3.solution(cnt, aArr, bArr)){
            System.out.println(x);
        }
    }

    public List<String> solution(int cnt, int [] aArr, int [] bArr) {
        List<String> answer = new ArrayList<>();

        for(int i = 0; i < cnt; i++) {
            int a = aArr[i];
            int b = bArr[i];

            if(a == b) {
                answer.add("D");
            } else if ( a== 1 && b == 3) {
                answer.add("A");
            } else if ( a==2 && b ==1) {
                answer.add("A");
            } else if ( a== 3 && b == 2) {
                answer.add("A");
            } else {
                answer.add("B");
            }
        }

        return answer;
    }
}
