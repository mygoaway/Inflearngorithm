package com.example.algorithm.part5;

import java.util.Scanner;
import java.util.Stack;

public class section1 {
    public static void main(String[] args) {
        section1 se1 = new section1();
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        System.out.print(se1.solution(str));
    }

    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack();

        for(char ch : str.toCharArray()) {
            if(ch == '(') {
                stack.push(ch);
            } else {
                if(stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty()) {
            return "NO";
        }
        return answer;
    }
}
