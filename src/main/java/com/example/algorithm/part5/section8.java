package com.example.algorithm.part5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
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

        while(!q.isEmpty()){
            Person person = q.poll();
            for(Person p : q) {
                if(p.priority > person.priority) {
                    q.offer(person);
                    person = null;
                    break;
                }
            }

            if(person != null) {
                answer++;
                if(person.id == people) {
                    return answer;
                }
            }
        }



        return answer;
    }
}
