package com.example.algorithm.part7;

import java.util.Scanner;

// 재귀함수(자기가 자신을 호출) - dfs / recursive
// 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지 출력하는 프로그램을 작성하세요.
public class section1 {
    public static void main(String[] args) {
        section1 se1 = new section1();
        se1.dfs(3);
    }

    public void dfs(int n) {
        if(n == 0) {
            return;
        } else {
            dfs(n-1);
            System.out.println("n의 값은 = " + n);
        }
    }
}
