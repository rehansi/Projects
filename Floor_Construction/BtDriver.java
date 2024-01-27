package com.greatlearning.main;

import com.greatlearning.dsa2.BtTree;

public class BtDriver {
	public static void main(String[] args) {

		BtTree btree = new BtTree();

		btree.insert(50);
		btree.insert(30);
		btree.insert(60);
		btree.insert(10);
		btree.insert(55);
		btree.inOrder(btree.root);

	}
}
