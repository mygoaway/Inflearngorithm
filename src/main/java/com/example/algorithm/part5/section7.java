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

        for(char ch : criteria.toCharArray()) {
            q.offer(ch);
        }

        for(char ch : str.toCharArray()) {
            if(q.contains(ch)) {
                if(q.poll() != ch) {
                    return "NO";
                }
            }
        }
        return answer;
    }
}