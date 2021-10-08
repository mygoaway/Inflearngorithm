package com.example.algorithm.part5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class section7 {
    public static void main(String[] args) {
        section7 se1 = new section7();
        Scanner scan = new Scanner(System.in);

        String criteria = scan.next();
        String str = scan.next();

        System.out.print(se1.solution(criteria, str));
    }

    public String solution(String criteria, String str) {
        String answer = "YES";

        Queue<Character> q = new LinkedList<>();
        for(int i = 0; i < criteria.length(); i++) {
            q.offer(criteria.charAt(i));
        }

        for(char x : str.toCharArray()) {
            if(q.contains(x)) {
                // 필수과목
                if(x!= q.poll()) {
                    return "NO";
                }
            }
        }

        if(!q.isEmpty()) {
            return "NO";
        }

        return answer;
    }
}