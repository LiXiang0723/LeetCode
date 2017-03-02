/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author johnxiang
 */
public class Node {

    /**
     * @return the left
     */
    public Node getLeft() {
        return left;
    }

    /**
     * @param left
     *            the left to set
     */
    public void setLeft(Node left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public Node getRight() {
        return right;
    }

    /**
     * @param right
     *            the right to set
     */
    public void setRight(Node right) {
        this.right = right;
    }

    /**
     * @return the key
     */
    public int getKey() {
        return key;
    }

    /**
     * @param key
     *            the key to set
     */
    public void setKey(int key) {
        this.key = key;
    }

    private Node left;
    private Node right;
    private int key;

    public Node(int k) {
        this.key = k;
    }

}
