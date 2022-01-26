package com.example.algorithm.part8;

import java.util.Scanner;

// 4. 중복순열 구하기
// 1부터 N까지 번호가 적힌 구슬이 있습니다. 이 중 중복을 허락하여 M번을 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
public class section4 {
    static int answer= Integer.MIN_VALUE;
    static int n, m;
    static int [] arr;

    public void DFS(int L) {
        if(L == m) {
            for(int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for(int i = 1; i <= n; i++) {
                arr[L] = i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        section4 se1 = new section4();
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        arr = new int[m];
        se1.DFS(0);
    }
}
