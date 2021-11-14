package com.example.algorithm.part5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int num;
    int priority;

    public Person(int num, int priority) {
        this.num = num;
        this.priority = priority;
    }
}

public class section8 {
    public static void main(String[] args) {
        section8 se1 = new section8();
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        int people = scan.nextInt();
        int [] intArr = new int[cnt];
        for(int i = 0; i < cnt; i++) {
            intArr[i] = scan.nextInt();
        }

        System.out.print(se1.solution(cnt, people, intArr));
    }

    public int solution(int cnt, int people, int [] intArr) {
        int answer = 0;
        Queue<Person> q = new LinkedList<>();

        for(int i = 0; i < cnt; i++) {
            q.offer(new Person(i, intArr[i]));
        }

        while(!q.isEmpty()) {
            Person p = q.poll();
            for(Person x : q) {
                if(x.priority > p.priority) {
                    q.offer(p);
                    p = null;
                    break;
                }
            }

            if( p != null) {
                answer++;
                if(p.num == people) {
                    return answer;
                }
            }
        }
        
        return answer;
    }
}
