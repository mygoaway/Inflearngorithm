package com.example.algorithm.part1;

import java.util.ArrayList;
import java.util.Scanner;

public class section4 {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();

        // StringBuilder 객체 이용하는 방법
        /*
        for(String x : strArr) {
            String tmp = new StringBuilder(x).reverse().toString();
            list.add(tmp);
        }
        */

        // 일일이 하나씩 뒤집는 방법
        for(String x : strArr) {
            char [] s = x.toCharArray();
            int lt = 0;
            int rt = s.length-1;
            while(lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String str = String.valueOf(s);
            list.add(str);
        }
        return list;
    }

    public static void main(String[] args) {
        section4 se = new section4();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String [] strArr = new String[n];

        for(int i = 0; i < strArr.length; i++) {
            strArr[i] = scan.next();
        }

        for(String x : se.solution(strArr)){
            System.out.println(x);
        }
    }
}
