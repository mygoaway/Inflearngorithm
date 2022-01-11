package com.example.algorithm.part5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class section6 {
    public static void main(String[] args) {
        section6 se1 = new section6();
        Scanner scan = new Scanner(System.in);

        int people = scan.nextInt();
        int cnt = scan.nextInt();

        System.out.print(se1.solution(people, cnt));
    }

    public int solution(int people, int cnt) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < people; i++) {
            q.offer(i+1);
        }

        while(!q.isEmpty()) {
            for (int i = 0; i < cnt-1; i++) {
                q.offer(q.poll());
            }

            q.poll();
            if(q.size() == 1) {
                answer = q.poll();
            }

        }

        return answer;
    }
}