package com.example.algorithm.part7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 인접 행렬
public class section11 {
    static int n, m, answer = 0;
    static int [][] graph;
    static int [] ch;

    public void DFS(int v) {
        if(v == m) {
            answer++;
        } else {
            for(int i = 1; i <=n; i++) {
                if(graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        section11 section11 = new section11();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for(int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        section11.DFS(1);
        System.out.println(answer);
    }
}
