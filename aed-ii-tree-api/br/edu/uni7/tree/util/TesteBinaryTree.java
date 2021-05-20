package br.edu.uni7.tree.util;

import br.edu.uni7.tree.BinaryTree;

public class TesteBinaryTree {

	public static void main(String[] args) {
		BinaryTree r = new BinaryTree("a");
		r.insertLeft("b");
		r.insertRight("right");
		r.getLeftChild().insertLeft("k");
		
		System.out.println(r.getKey());
		
		System.out.println(r.getLeftChild().getLeftChild().getKey());
		
		System.out.println(r);
	}
}
