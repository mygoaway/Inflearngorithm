package com.example.algorithm.part3;

import sun.security.pkcs11.P11TlsKeyMaterialGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class section1 {
    public static void main(String[] args) {
        section1 se1 = new section1();
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

        int p1 = 0;
        int p2 = 0;

        while(p1 < a && p2 < b) {
            if(intArrA[p1] < intArrB[p2]) {
                answer.add(intArrA[p1]);
                p1++;
            } else {
                answer.add(intArrB[p2]);
                p2++;
            }
        }

        while(p1 < a) {
            answer.add(intArrA[p1]);
            p1++;
        }

        while(p2 < b) {
            answer.add(intArrB[p2]);
            p2++;
        }

        return answer;
    }
}
