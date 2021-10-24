package com.example.algorithm.part7;

// 피보나치 수열
// 1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
// 2) 입력은 피보나치 수열의 총 항의 수이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.

class Node{
    int data;
    Node lt, rt;
    public Node(int data) {
        this.data = data;
        lt=rt=null;
    }
}

public class section5 {
    Node root;

    public void dfs(Node root) {
        if(root == null) {
            return;
        } else {
            // 전위순환출력 : System.out.println(root.data);
            dfs(root.lt);
            // 중위순환출력 : System.out.println(root.data);
            dfs(root.rt);
            // 후위순환출력
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
