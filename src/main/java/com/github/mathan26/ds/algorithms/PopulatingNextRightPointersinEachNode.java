package com.github.mathan26.ds.algorithms;

public class PopulatingNextRightPointersinEachNode {
    public Node connect(Node root) {
        Node levelStart = root;
        while (levelStart != null) {
            Node curr = levelStart;
            while (curr != null) {
                if (curr.left != null) {
                    curr.left.next = curr.right;
                }
                if (curr.right != null && curr.next != null) {
                    curr.right.next = curr.next.left;
                }
                // move the current node to the next position
                curr = curr.next;
            }
            // move the levelStart node the next level's head position
            levelStart = levelStart.left;
        }
        return root;

    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};