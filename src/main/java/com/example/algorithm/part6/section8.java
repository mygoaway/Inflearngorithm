package com.example.algorithm.part6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class section8 {
    public static void main(String[] args) {
        section8 se1 = new section8();
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        int num = scan.nextInt();
        int [] intArr= new int[cnt];
        for(int i = 0; i < cnt; i++)
            intArr[i] = scan.nextInt();
        System.out.println(se1.solution(cnt, num, intArr));
    }

    public int solution(int cnt, int num, int [] intArr) {
        int answer = 0;
        Arrays.sort(intArr);

        int lt = 0;
        int rt = cnt -1;
        while (lt <= rt) {
            int mid = (lt+rt) / 2;
            if(intArr[mid] == num) {
                answer = mid+1;
            }
            if (intArr[mid] > num) {
                rt = mid-1;
            } else {
                lt = mid+1;
            }
        }

        return answer;
    }
}
