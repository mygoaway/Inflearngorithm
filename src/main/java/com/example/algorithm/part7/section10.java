package com.example.algorithm.part7;

import java.util.LinkedList;
import java.util.Queue;

// Tree 말단 노드까지의 가장 짧은 경로(BFS)
public class section10 {
    Node root;
    public int bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                Node node = q.poll();

                if(node.lt == null && node.rt == null) {
                    return L;
                }

                if(node.lt != null) {
                    q.offer(node.lt);
                }
                if(node.rt != null) {
                    q.offer(node.rt);
                }
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        section10 tree = new section10();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.bfs(tree.root));
    }
}
