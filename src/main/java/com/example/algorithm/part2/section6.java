package com.example.algorithm.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class section6 {
    public static void main(String[] args) {
        section6 se3 = new section6();
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

        for(int i = 0; i < intArr.length; i++) {
            int tmp = intArr[i];
            int res = 0;
            while ( tmp > 0 ) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }

            if(isPrime(res)) {
                answer.add(res);
            }
        }


        return answer;
    }

    public boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
