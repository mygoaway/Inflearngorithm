package com.example.algorithm.part7;

import java.util.ArrayList;
import java.util.Scanner;

// 경로탐색(인접 리스트)
public class section12 {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int [] ch;

    public void DFS(int v) {
        if(v == n) {
            answer++;
        } else {
            for(int x : graph.get(v)) {
                if(ch[x] == 0) {
                    ch[x] = 1;
                    DFS(x);
                    ch[x] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        section12 section12 = new section12();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();
        graph = new ArrayList<>();
        for(int i = 0; i <=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph.get(a).add(b);
        }
        ch = new int[n+1];
        ch[1] = 1;
        section12.DFS(1);
        System.out.println(answer);
    }
}
