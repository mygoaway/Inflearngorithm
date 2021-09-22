package com.example.algorithm.part1;

import java.util.ArrayList;
import java.util.Scanner;

public class section4 {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < strArr.length; i++) {
            char[] charArray = strArr[i].toCharArray();
            int lt = 0;
            int rt = charArray.length - 1;
            while(lt < rt) {
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;
                lt++;
                rt--;
            }
            list.add(String.valueOf(charArray));
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
