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
        Queue<Nodes> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        while(!q.isEmpty()) {
            System.out.print(L + " : ");
            int size = q.size();
            for(int i = 0; i < size; i++) {
                Nodes nodes = q.poll();
                System.out.print(nodes.data);
                if(nodes.lt != null) {
                    q.offer(nodes.lt);
                }
                if(nodes.rt != null) {
                    q.offer(nodes.rt);
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
