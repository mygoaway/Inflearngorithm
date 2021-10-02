package com.example.algorithm.part3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class section2 {
    public static void main(String[] args) {
        section2 se1 = new section2();
        Scanner scan = new Scanner(System.in);

        int cntA = scan.nextInt();
        int [] intArrA = new int[cntA];
        for(int i = 0; i < intArrA.length; i++) {
            intArrA[i] = scan.nextInt();
        }

        int cntB = scan.nextInt();
        int [] intArrB = new int[cntB];
        for(int i = 0; i < intArrB.length; i++) {
            intArrB[i] = scan.nextInt();
        }

        for(int x : se1.solution(cntA, cntB, intArrA, intArrB)){
            System.out.print(x + " ");
        }
    }

    public List<Integer> solution(int a, int b, int [] intArrA, int [] intArrB) {
        List<Integer> answer = new ArrayList<>();

        Arrays.sort(intArrA);
        Arrays.sort(intArrB);


        int p1 = 0;
        int p2 = 0;

        while(p1 < a && p2 < b) {
            if(intArrA[p1] == intArrB[p2]) {
                answer.add(intArrA[p1]);
                p1++;
                p2++;
            } else if (intArrA[p1] > intArrB[p2]) {
                p2++;
            } else {
                p1++;
            }
        }


        return answer;
    }
}
