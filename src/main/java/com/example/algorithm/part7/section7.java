package com.example.algorithm.part7;

import java.util.LinkedList;
import java.util.Queue;

// 이진트리순회(DFS)
class Nodes {
    int data;
    Nodes lt, rt;
    public Nodes(int val) {
        this.data = val;
        lt=rt=null;
    }
}

public class section7 {
    Nodes root;
    public void bfs(Nodes root) {
        Queue<Nodes> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Nodes curr = Q.poll();
                System.out.print(curr.data);
                if (curr.lt != null) {
                    Q.offer(curr.lt);
                }
                if (curr.rt != null) {
                    Q.offer(curr.rt);
                }
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        section7 tree = new section7();
        tree.root = new Nodes(1);
        tree.root.lt = new Nodes(2);
        tree.root.rt = new Nodes(3);
        tree.root.lt.lt = new Nodes(4);
        tree.root.lt.rt = new Nodes(5);
        tree.root.rt.lt = new Nodes(6);
        tree.root.rt.rt = new Nodes(7);
        tree.bfs(tree.root);
    }
}
