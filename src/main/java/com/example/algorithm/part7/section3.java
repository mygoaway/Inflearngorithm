package com.example.algorithm.part7;

// 팩토리얼
// 자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요.
// 예를 들어 5! 5*4*3*2*1=120입니다.
public class section3 {
    public static void main(String[] args) {
        section3 se1 = new section3();
        System.out.println(se1.dfs(5));
    }

    public int dfs(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n*dfs(n-1);
        }
    }
}
