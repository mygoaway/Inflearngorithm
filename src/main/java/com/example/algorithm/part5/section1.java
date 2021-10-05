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

        Stack st = new Stack();
        char [] charArr = str.toCharArray();

        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == '(') {
                st.push(charArr[i]);
            } else
                if(st.isEmpty()) {
                    return "NO";
                }
                st.pop();
           }

        if(!st.empty()) {
            return "NO";
        }
        return answer;
    }
}
