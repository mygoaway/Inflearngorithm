package com.example.algorithm.part7;

import java.util.LinkedList;
import java.util.Queue;

// Tree 말단 노드까지의 가장 짧은 경로(BFS)
public class section10 {
    Node root;
    public int bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                Node current = queue.poll();
                if(current.lt == null && current.rt == null) {
                    return L;
                }

                if(current.lt != null) {
                    queue.offer(current.lt);
                }

                if(current.rt != null) {
                    queue.offer(current.rt);
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
