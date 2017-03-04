/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import common.Node;

/**
 * 
 * @author johnxiang
 */
public class BinaryTree {

    private Node root;

    public BinaryTree() {
	this.root = null;
    }

    public void add(Node n) {
	if (this.root == null) {
	    this.root = n;
	} else {
	    Node p = findNodeForKey(this.root, n.getKey());
	    if (n.getKey() < p.getKey()) {
		p.setLeft(n);
	    } else {
		p.setRight(n);
	    }
	}
    }

    public void remove(Node n) {
	Node p = findParentNode(this.root, n.getKey());
	if (p != null) {
	    if (p.getLeft() != null && p.getLeft().getKey() == n.getKey()) {
		p.setLeft(null);
	    } else {
		p.setRight(null);
	    }
	} else {
	    System.out.println("cannot find node");
	}

    }

    public int getCount() {
	BinaryTree left = getLeftChild(root.getKey());
	BinaryTree right = getRightChild(root.getKey());

	return 1 + (left != null ? left.getCount() : 0)
		+ (right != null ? right.getCount() : 0);
    }

    public BinaryTree copy() {
	BinaryTree newTree = new BinaryTree();
	newTree = addNodeWithChidren(newTree, this.root);

	return newTree;
    }

    public BinaryTree getLeftChild(int k) {
	BinaryTree leftTree = null;
	Node p = findNodeForKey(root, k);
	if (p == null) {
	    System.out.println("Cannot find key with value " + k);
	    return leftTree;
	}

	if (p.getLeft() != null) {
	    leftTree = new BinaryTree();
	    leftTree = addNodeWithChidren(leftTree, p.getLeft());
	}

	return leftTree;
    }

    public BinaryTree getRightChild(int k) {
	BinaryTree rightTree = null;
	Node p = findNodeForKey(root, k);
	if (p == null) {
	    System.out.println("Cannot find key with value " + k);
	    return rightTree;
	}
	if (p.getRight() != null) {
	    rightTree = new BinaryTree();
	    rightTree = addNodeWithChidren(rightTree, p.getRight());
	}
	return rightTree;
    }

    private BinaryTree addNodeWithChidren(BinaryTree bt, Node parent) {
	bt.add(new Node(parent.getKey()));

	if (parent.getLeft() != null) {
	    bt = addNodeWithChidren(bt, parent.getLeft());
	}

	if (parent.getRight() != null) {
	    bt = addNodeWithChidren(bt, parent.getRight());
	}
	return bt;

    }

    private Node findParentNode(Node parent, int target) {
	if (target < parent.getKey()) {
	    // go to left
	    if (parent.getLeft() != null) {
		if (target == parent.getLeft().getKey()) {
		    return parent;
		} else {
		    parent = findParentNode(parent.getLeft(), target);
		}
	    } else {
		// Reaches leaves
		return null;
	    }
	} else {
	    // go to right
	    if (parent.getRight() != null) {
		if (target == parent.getRight().getKey()) {
		    return parent;
		} else {
		    parent = findParentNode(parent.getRight(), target);
		}
	    } else {
		// Reaches leaves
		return null;
	    }
	}
	return parent;
    }

    private Node findNodeForKey(Node parent, int k) {
	if (parent.getKey() == k) {
	    return parent;
	}

	if (k < parent.getKey()) {
	    if (parent.getLeft() != null) {
		parent = findNodeForKey(parent.getLeft(), k);
	    }
	} else {
	    if (parent.getRight() != null) {
		parent = findNodeForKey(parent.getRight(), k);
	    }
	}
	return parent;
    }

}
