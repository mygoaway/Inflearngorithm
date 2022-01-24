package com.example.algorithm.part7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 그래프 최단거리(BFS)
public class section13 {
    static int n, m = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int [] ch, dis;

    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int currentValue = queue.poll();
                for (int nextVale : graph.get(currentValue)) {
                    if (ch[nextVale] == 0) {
                        ch[nextVale] = 1;
                        queue.offer(nextVale);
                        dis[nextVale] = dis[currentValue] + 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        section13 section12 = new section13();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();
        graph = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        ch = new int[n+1];
        ch[1] = 1;
        dis = new int[n+1];
        dis[1] = 0;
        for(int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph.get(a).add(b);
        }

        section12.BFS(1);
        for(int i = 2; i <= n; i++) {
            System.out.println(i+" : " + dis[i]);
        }
    }
}
