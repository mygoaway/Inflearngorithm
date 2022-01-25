package com.example.algorithm.part7;

// 부분집합 구하기 - DFS(깊이 우선 탐색)
// 자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요
// 첫 번째 줄부터 각 줄에 하나씩 부분집합을 아래와 출력예쩨와 같은 순서로 출력한다.
// 단, 공집합은 출력하지 않습니다.
public class section6 {
    static int n; // 집합원소의 개수
    static int [] ch; // 체크배열

    public void dfs(int L) {
        if(L == n+1) {
            String tmp ="";
            for(int i = 1; i <= n; i++) {
                if(ch[i] == 1) {
                    tmp += i + " ";
                }
            }

            if(tmp.length() > 0) {
                System.out.println(tmp);
            }

        } else {
            ch[L] = 1;
            dfs(L+1);
            ch[L] = 0;
            dfs(L+1);
        }

    }

    public static void main(String[] args) {
        section6 se1 = new section6();
        n = 3;
        ch = new int[n+1];
        se1.dfs(1);
    }
}
