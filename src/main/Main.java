/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import common.Node;
import implementations.BinaryTree;

/**
 *
 * @author johnxiang
 */
public class Main {

    /**
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(4);

        bt.add(new Node(5));
        bt.add(new Node(2));
        Node n = new Node(10);
        bt.add(n);
        bt.remove(n);
    }

}