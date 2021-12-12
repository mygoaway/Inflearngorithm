package com.example.algorithm.part6;

import java.util.Arrays;
import java.util.Scanner;


public class section9 {
    public static void main(String[] args) {
        section9 se1 = new section9();
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
        int lt = Arrays.stream(intArr).max().getAsInt();
        int rt = Arrays.stream(intArr).sum();

        while(lt <= rt) {
            int mid = (lt+rt) / 2;
            if(count(intArr, mid) <= num) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }


    public int count(int [] arr, int capacity) {
        int cnt = 1;
        int sum = 0;

        for(int x : arr) {
            if(sum+x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum+=x;
            }
        }


        return cnt;
    }
}
