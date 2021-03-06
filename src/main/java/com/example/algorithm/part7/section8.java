package com.example.algorithm.part7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 송아지 찾기 - BFS(넓이우선탐색) = 최단거리 알고리즘
public class section8 {
    int [] distance = {1, -1, 5};
    int [] check;
    Queue<Integer> queue = new LinkedList<>();

    public int bfs(int s, int e) {
        check = new int[10001];
        check[s] = 1;
        queue.offer(s);
        int L = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                Integer current = queue.poll();
                for(int dist : distance) {
                    int updateData = current + dist;

                    if(updateData == e) {
                        return L+1;
                    }

                    if(updateData >= 1 && updateData <= 10000 && check[updateData] == 0) {
                        check[updateData] = 1;
                        queue.offer(updateData);
                    }
                }
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        section8 se1 = new section8();
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int e = scan.nextInt();
        System.out.println(se1.bfs(s,e));
    }
}
