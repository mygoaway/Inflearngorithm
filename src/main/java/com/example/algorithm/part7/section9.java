package com.example.algorithm.part7;

// Tree 말단 노드까지의 가장 짧은 경로(dfs)
public class section9 {
    Node root;
    public int dfs(int level, Node root) {
        if(root.lt == null && root.rt == null) {
            return level;
        } else {
            return Math.min(dfs(level+1, root.lt), dfs(level+1, root.rt));
        }
    }

    public static void main(String[] args) {
        section9 tree = new section9();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.dfs(0, tree.root));
    }
}
