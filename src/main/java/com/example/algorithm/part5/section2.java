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
        Stack <Character> st = new Stack<>();

        for(char ch : str.toCharArray()) {
            if(ch == ')') {
                while(st.pop() != '(');
            } else {
                st.push(ch);
            }
        }

        for(int i = 0; i < st.size(); i++) {
            answer += st.get(i);
        }

        return answer;
    }
}
