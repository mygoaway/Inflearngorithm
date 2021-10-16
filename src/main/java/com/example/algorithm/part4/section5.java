package com.example.algorithm.part4;

import java.util.*;

public class section5 {
    public static void main(String[] args) {
        section5 se1 = new section5();
        Scanner scan = new Scanner(System.in);

        int cntA = scan.nextInt();
        int cntB = scan.nextInt();
        int [] intArrA = new int[cntA];
        for(int i = 0; i < intArrA.length; i++) {
            intArrA[i] = scan.nextInt();
        }

        System.out.print(se1.solution(cntA, cntB, intArrA));

    }

    public int solution(int a, int b, int [] intArrA) {
        int answer = 0;
        TreeSet <Integer> set = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0; i < intArrA.length; i++) {
            for(int j = i+1; j < intArrA.length; j++) {
                for(int k = j+1; k < intArrA.length; k++) {
                    set.add(intArrA[i] + intArrA[j] + intArrA[k]);
                }
            }
        }

        List<Integer>list = new ArrayList<>(set);
        answer = list.get(b-1);
        return answer;
    }
}
