package com.example.algorithm.part1;

import java.util.ArrayList;
import java.util.Scanner;

public class section4 {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();

        for(String x : strArr) {
            char [] ch = x.toCharArray();
            int lt = 0;
            int rt = ch.length - 1;
            while(lt < rt) {
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
            list.add(String.valueOf(ch));
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
