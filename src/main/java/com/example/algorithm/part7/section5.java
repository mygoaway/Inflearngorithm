package com.example.algorithm.part7;

// 이진트리순회 - DFS(깊이 우선 탐색)
class Node {
    int data;
    Node lt;
    Node rt;

    public Node(int data) {
        this.data = data;
        lt=rt=null;
    }
}

public class section5 {
    Node root;
    public void dfs(Node node) {
        if(node == null) {
            return;
        } else {
            dfs(node.lt);
            dfs(node.rt);
            System.out.println(node.data);
        }
    }
    
    public static void main(String[] args) {
        section5 se5 = new section5();
        se5.root = new Node(1);
        se5.root.lt = new Node(2);
        se5.root.rt = new Node(3);
        se5.root.lt.lt = new Node(4);
        se5.root.lt.rt = new Node(5);
        se5.root.rt.lt = new Node(6);
        se5.root.rt.rt = new Node(7);
        se5.dfs(se5.root);
    }
}
