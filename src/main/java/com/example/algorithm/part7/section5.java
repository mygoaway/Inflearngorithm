package com.example.algorithm.part7;

// 이진트리순회 - DFS(깊이 우선 탐색)
class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        this.data = val;
        lt=rt=null;
    }
}

public class section5 {
    Node root;
    public void dfs(Node root) {
        if(root == null) {
            return;
        } else {
            dfs(root.lt);
            dfs(root.rt);
            System.out.println(root.data);
        }
    }

    public static void main(String[] args) {
        section5 tree = new section5();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.dfs(tree.root);
    }
}
