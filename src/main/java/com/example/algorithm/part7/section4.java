package com.example.algorithm.part7;

// 피보나치 수열
// 1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
// 2) 입력은 피보나치 수열의 총 항의 수이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
public class section4 {
    static int [] fibo;

    public static void main(String[] args) {
        section4 se1 = new section4();
        int n = 45;
        fibo = new int[n+1];
        se1.dfs(n);
        for(int i = 1; i <= 45; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    public int dfs(int n) {
        if(fibo[n] > 0) {
            return fibo[n];
        }

        if(n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = dfs(n-1) + dfs(n-2);
        }


    }
}
