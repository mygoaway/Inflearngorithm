package com.example.algorithm.part5;

import java.util.Scanner;
import java.util.Stack;

public class section5 {
    public static void main(String[] args) {
        section5 se1 = new section5();
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        System.out.print(se1.solution(str));
    }

    public int solution(String str) {
        int answer = 0;
        Stack<Character> st = new Stack();


        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                st.push(str.charAt(i));
            } else {
                st.pop();
                if(str.charAt(i-1) == '(') {
                    answer += st.size();
                } else {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
