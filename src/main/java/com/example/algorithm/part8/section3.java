package com.example.algorithm.part8;

import java.util.Scanner;

// 2. 바둑이 승차(DFS)
// 철수는 그의 바둑이들을 데리고 시장에 가려고 한다. 그런데 그의 트럭은 C킬로그램 넘게 태울수가 없다.
// 철수는 C를 넘지 않으면서 그의 바둑이들을 가장 무겁게 태우고 싶다.
// N마리의 바둑이와 각 바둑이의 무게 W가 주어지면, 철수가 트럭에 태울 수 있는 가장 무거운 무게를 구하는 프로그램을 작성하세요.
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
