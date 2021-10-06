package com.example.algorithm.part5;

import java.util.Scanner;
import java.util.Stack;

public class section4 {
    public static void main(String[] args) {
        section4 se1 = new section4();
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        System.out.print(se1.solution(str));
    }

    public int solution(String str) {
        int answer = 0;

        Stack<Integer> st = new Stack();

        for(char ch : str.toCharArray()) {
            if(Character.isDigit(ch)) {
                st.push(ch-48);
            } else {
                int rt = st.pop();
                int lt = st.pop();
                if(ch == '+') {
                    st.push(lt+rt);
                } else if (ch== '-') {
                    st.push(lt-rt);
                } else if (ch == '*') {
                    st.push(lt*rt);
                } else {
                    st.push(lt/rt);
                }
            }
        }

        answer = st.get(0);

        return answer;
    }
}
