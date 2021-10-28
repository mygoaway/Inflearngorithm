package com.example.algorithm.part7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 부분집합 구하기(DFS)
// 자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요
// 첫 번째 줄부터 각 줄에 하나씩 부분집합을 아래와 출력예쩨와 같은 순서로 출력한다.
// 단, 공집합은 출력하지 않습니다.
public class section8 {
    int answer;
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
                    int xn = x+dis[j];
                    if(xn == e) {
                        return L+1;
                    }
                    if(xn >= 1 && xn <= 10000 && ch[xn] == 0) {
                        ch[xn] = 1;
                        q.offer(xn);
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
