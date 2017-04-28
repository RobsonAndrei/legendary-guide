/***
 * Copyright (c) 1994, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

package br.pucrs.ap3.trees;

/**
 * 
 * @author Robson Andrei dos Santos
 *
 */
public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void add(int value) {
		root = add0(root, value);
	}

	public boolean contains(int value) {
		return contains0(root, value);
	}

	private Node add0(Node node, int value) {
		if (node == null) {
			Node n = new Node();
			n.key = value;
			n.left = null;
			n.right = null;
			return n;
		}
		if (node.key == value)
			throw new RuntimeException("Valor existente!");
		if (node.key < value)
			node.right = add0(node.right, value);
		else
			node.left = add0(node.left, value);
		return node;
	}

	private boolean contains0(Node node, int value) {
		if (node == null)
			return false;
		if (node.key == value)
			return true;
		if (node.key < value)
			return contains0(node.right, value);
		return contains0(node.left, value);

	}

	public int size() {
		return size0(root);
	}

	private int size0(Node node) {
		if (node == null)
			return 0;

		return 1 + size0(node.left) + size0(node.right);
	}

	@Override
	public String toString() {
		return toString0(root);
	}

	private String toString0(Node node) {
		if (node == null)
			return " # ";
		return toString0(node.left) + String.format(" %d ", node.key) + toString0(node.right);
	}

	/***
	 * Reports level number for every node.
	 * 
	 * Prints key and level for every node. Root node is at level
	 */
	public void reportLevel() {
		reportLevel0(root, 0);

	}

	private void reportLevel0(Node node, int level) {

		if (node != null) {
			System.out.printf("Key=%d Level=%d!\n", node.key, level);

			reportLevel0(node.left, level + 1);
			reportLevel0(node.right, level + 1);

		}

	}

}
