package com.example.algorithm.part1;

import java.util.Scanner;

public class section12 {
    public String solution(int cnt, String str) {
        String answer = "";

        for(int i = 0; i < cnt; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            System.out.println(tmp + " " + num);
            str = str.substring(7);

        }


        return answer;
    }

    public static void main(String[] args) {
        section12 se = new section12();

        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        String str = scan.next();

        System.out.println(se.solution(cnt, str));
    }
}
