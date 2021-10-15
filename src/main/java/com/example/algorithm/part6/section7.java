package com.example.algorithm.part6;

import java.util.*;


public class section7 {
    public static void main(String[] args) {
        section7 se1 = new section7();
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        List<Point> list = new ArrayList<>();
        for(int i = 0; i < cnt; i++) {
            list.add(new Point(scan.nextInt(), scan.nextInt()));
        }
        Collections.sort(list);
        for(Point p : list) {
            System.out.println(p.x +" " + p.y);
        }
    }
}

class Point implements Comparable<Point>{
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) {
            return this.y - o.y;
        } else {
            return this.x - o.x;
        }
    }
}