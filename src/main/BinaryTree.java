/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author johnxiang
 */
public class BinaryTree {

    private Node root;

    public BinaryTree(int k) {
        root = new Node(k);
    }

    public void add(Node n) {
        Node p = findLeaveForInsert(root, n);
        if (n.getKey() < p.getKey()) {
            p.setLeft(n);
        } else {
            p.setRight(n);
        }

    }

    public void remove(Node n) {
        Node p = findParentNode(root, n);
        if (p != null) {
            if (p.getLeft() != null && p.getLeft().getKey() == n.getKey()) {
                p.setLeft(null);
            } else {
                p.setRight(null);
            }
        }

    }

    private Node findLeaveForInsert(Node parent, Node target) {
        if (target.getKey() < parent.getKey()) {
            // go to left
            if (parent.getLeft() != null) {
                parent = findLeaveForInsert(parent.getLeft(), target);
            }
        } else {
            // go to right
            if (parent.getRight() != null) {
                parent = findLeaveForInsert(parent.getRight(), target);
            }
        }
        return parent;
    }

    private Node findParentNode(Node parent, Node target) {
        if (target.getKey() < parent.getKey()) {
            // go to left
            if (parent.getLeft() != null) {
                if (target.getKey() == parent.getLeft().getKey()) {
                    return parent;
                } else {
                    parent = findParentNode(parent.getLeft(), target);
                }
            } else {
                return null;
            }
        } else {
            // go to right
            if (parent.getRight() != null) {
                if (target.getKey() == parent.getRight().getKey()) {
                    return parent;
                } else {
                    parent = findParentNode(parent.getRight(), target);
                }
            } else {
                return null;
            }
        }
        return parent;
    }
}
