package br.edu.uni7.tree.util;

import br.edu.un7.aed2.tree.algs.Traversals;
import br.edu.uni7.tree.BinaryTree;

public class TesteTraversals {
	public static void main(String[] args) {
		BinaryTree<String> root = new BinaryTree<String>("Book");
		
		root.insertLeft("Chapter 01");
		root.insertRight("Chapter 02");
		
		BinaryTree<String> chapter1 = root.getLeftChild();
		BinaryTree<String> chapter2 = root.getLeftChild();
		
		chapter1.insertLeft("Section 1.1");
		chapter1.insertRight("Section 1.2");
		
		chapter2.insertLeft("Section 2.1");
		
		System.out.println(root);
		
		Traversals<String> traversals = new Traversals<String>();
		traversals.preOrder(root);
		
		System.out.println();
		
		traversals.inOrder(root);

		System.out.println();
		
		traversals.posOrder(root);
		
	}
}
