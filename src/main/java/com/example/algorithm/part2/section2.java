package com.example.algorithm.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class section2 {
    public static void main(String[] args) {
        section2 se2 = new section2();
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int [] intArr = new int[cnt];
        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = scan.nextInt();
        }

        System.out.print(se2.solution(intArr));
    }

    public int solution(int [] intArr) {
        int answer = 1;
        int max = intArr[0];

        for(int i = 1; i < intArr.length; i++) {
            if(intArr[i] > max ) {
                max = intArr[i];
                answer++;
            }
        }


        return answer;
    }
}
