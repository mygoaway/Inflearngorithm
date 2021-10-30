package com.example.algorithm.part7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class section8 {
    int [] dis = {1, -1, 5};
    int [] ch;
    Queue<Integer> q = new LinkedList<>();

    public int bfs(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        q.offer(s);
        int L = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                Integer x = q.poll();
                for(int j = 0; j < dis.length; j++) {
                    int xj = x + dis[j];
                    if(xj == e) {
                        return L+1;
                    }
                    if(xj >= 1 && xj <= 10000 && ch[xj] == 0) {
                        ch[xj] = 1;
                        q.offer(xj);
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
