package com.example.algorithm.part4;

import java.util.*;

public class section3 {
    public static void main(String[] args) {
        section3 se1 = new section3();
        Scanner scan = new Scanner(System.in);

        int cntA = scan.nextInt();
        int cntB = scan.nextInt();
        int [] intArrA = new int[cntA];
        for(int i = 0; i < intArrA.length; i++) {
            intArrA[i] = scan.nextInt();
        }

        for(int x : se1.solution(cntA, cntB, intArrA)) {
            System.out.print(x + " ");
        }
    }

    public List <Integer> solution(int a, int b, int [] intArrA) {
        List<Integer> answer = new ArrayList<>();

        Map <Integer, Integer> check = new HashMap<>();

        for(int i = 0; i < b-1; i++) {
            check.put(intArrA[i], check.getOrDefault(intArrA[i], 0) + 1);
        }

        int lt = 0;
        for(int rt = b-1; rt < a; rt++) {
            check.put(intArrA[rt], check.getOrDefault(intArrA[rt],0 )+1);
            answer.add(check.size());
            check.put(intArrA[lt], check.get(intArrA[lt]) - 1);
            if(check.get(intArrA[lt]) == 0) {
                check.remove(intArrA[lt]);
            }
            lt++;
        }

        return answer;
    }
}
