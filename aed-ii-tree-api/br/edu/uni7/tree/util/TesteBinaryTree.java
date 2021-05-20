package br.edu.uni7.tree.util;

import br.edu.uni7.tree.BinaryTree;

public class TesteBinaryTree {
	public static void main(String[] args) {
		BinaryTree<String> r = new BinaryTree<String>("a");
		BinaryTree<Integer>b2 = new BinaryTree<Integer>(10);

		r.insertLeft("b");
		r.insertRight("c");
		r.getLeftChild().insertLeft("k");
		
		b2.insertLeft(20);
		b2.insertRight(30);
		
		System.out.println(b2);
		
		

		
	}
}
