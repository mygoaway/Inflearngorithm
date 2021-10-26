package com.example.algorithm.part7;

// 재귀함수를 이용한 이진수 출력
// 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요.
// 단, 재귀함수를 이용해서 출력해야 합니다.
public class section2 {
    public static void main(String[] args) {
        section2 se1 = new section2();
        se1.dfs(11);
    }

    public void dfs(int n) {
        if(n == 0){
            return;
        } else {
            dfs(n / 2);
            System.out.println(n % 2);
        }
    }

}
