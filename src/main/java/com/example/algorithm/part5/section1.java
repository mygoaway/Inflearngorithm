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
        Stack<Character> st = new Stack();

        for(char ch : str.toCharArray()) {
            if(ch == '(') {
                st.push(ch);
            } else {
                if(st.isEmpty()) {
                    return "NO";
                }
                st.pop();
            }
        }
        if(!st.isEmpty()) {
            return "NO";
        }

        return answer;
    }
}
