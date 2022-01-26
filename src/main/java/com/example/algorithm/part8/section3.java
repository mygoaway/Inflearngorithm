package com.example.algorithm.part8;

import java.util.Scanner;

// 3. 최대점수 구하기(DFS)
// 이번 정보 올림피아드대회에서 좋은 성적을 내기 위하여 현수는 선생님이 주신 N개의 문제를 풀려고 합니다.
// 각 문제는 그것을 풀었을 때 얻는 점수와 푸는데 걸리는 시간이 주어지게 됩니다.
// 제한시간 M안에 N개의 문제 중 최대점수를 얻을 수 있도록 해야 합니다.
// (해당문제는 해당시간이 걸리면 푸는 걸로 간주한다, 한 유형당 한개만 풀 수 있습니다.)
public class section3 {
    static int answer= Integer.MIN_VALUE;
    static int n, m;

    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {
        if(time > m) {
            return;
        }

        if(L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L+1, sum+ps[L], time+pt[L], ps, pt);
            DFS(L+1, sum, time, ps, pt);
        }
    }

    public static void main(String[] args) {
        section3 se1 = new section3();
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt(); // 문제 개수
        m = scan.nextInt(); // 걸리는 시간
        int [] arrA = new int[n];
        int [] arrB = new int[n];
        for(int i = 0; i < n; i++) {
            arrA[i] = scan.nextInt();
            arrB[i] = scan.nextInt();
        }
        se1.DFS(0, 0, 0, arrA , arrB);
        System.out.println(answer);
    }
}
