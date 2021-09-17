package com.example.algorithm.part2;

import java.util.Scanner;

public class section10 {
    public static void main(String[] args) {
        section10 se3 = new section10();
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int[][] intArr = new int[cnt][cnt];
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr.length; j++){
                intArr[i][j] = scan.nextInt();
            }
        }
        System.out.println(se3.solution(cnt, intArr));
    }

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public int solution(int cnt, int [][] intArr) {
        int answer = 0;

        for(int i = 0; i < cnt; i++) {
            for(int j = 0; j < cnt; j++) {
                boolean flag = true;
                for(int k = 0; k < 4; k++) {
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if(nx >= 0 && nx < cnt && ny >= 0 && ny < cnt && intArr[nx][ny] >= intArr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    answer++;
                }

            }
        }

        return answer;
    }


}
