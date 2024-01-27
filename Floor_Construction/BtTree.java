package com.greatlearning.dsa2;

public class BtTree {

	public Node root;

	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public void insert(int val) {
		root = insert(root, val);
	}

	public Node insert(Node root, int val) {

		if (root == null) {
			root = new Node(val);
			return root;
		}
		if (val < root.data) {
			root.left = insert(root.left, val);
		} else {

			root.right = insert(root.right, val);
		}
		return root;

	}

	public void inOrder(Node root) {
		if (root == null) {
			return;
		}

		else {
			inOrder(root.left);
			System.out.println(root.data + " ");

			inOrder(root.right);

		}
	}

}
