package com.example.algorithm.part5;

import java.util.Scanner;
import java.util.Stack;

public class section2 {
    public static void main(String[] args) {
        section2 se1 = new section2();
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        System.out.print(se1.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        Stack <Character> stack = new Stack<>();

        for(char ch : str.toCharArray()) {
            if(Character.isAlphabetic(ch) || ch == '(') {
                stack.push(ch);
            } else {
                while(stack.pop() != '(');
            }
        }
        for(int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }

        return answer;
    }
}
