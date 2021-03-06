package com.example.algorithm.part5;

import java.util.Scanner;
import java.util.Stack;

public class section3 {
    public static void main(String[] args) {
        section3 se1 = new section3();
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        int [][] intArrA = new int[cnt][cnt];
        for(int i = 0; i < cnt; i++) {
            for(int j = 0; j < cnt; j++) {
                intArrA[i][j] = scan.nextInt();
            }
        }

        int cntb = scan.nextInt();
        int [] intArrB = new int[cntb];
        for(int i = 0; i < cntb; i++) {
            intArrB[i] = scan.nextInt();
        }


        System.out.print(se1.solution(intArrA, intArrB));
    }

    public int solution(int [][] board, int [] moves) {
        int answer = 0;
        Stack <Integer> stack = new Stack<>();

        for(int x : moves) {
            for(int i = 0; i < board.length; i++) {
                if(board[i][x-1] != 0) {
                    int num = board[i][x-1];
                    board[i][x-1] = 0;
                    if(!stack.isEmpty() && stack.peek() == num) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(num);
                    }
                    break;
                }
            }
        }


        return answer;
    }
}
