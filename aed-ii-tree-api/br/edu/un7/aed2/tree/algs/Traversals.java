package br.edu.un7.aed2.tree.algs;

import br.edu.uni7.tree.BinaryTree;

public class Traversals<T> {
	public void preOrder(BinaryTree<T> tree) {
		if (tree != null) {
			System.out.println(tree.getKey());
			
			preOrder(tree.getLeftChild());
			preOrder(tree.getRightChild());
		}		
	}
	
	public void inOrder (BinaryTree<T> tree) {
		if(tree != null) {
			inOrder(tree.getLeftChild());
			
			System.out.println(tree.getKey());
			
			inOrder(tree.getRightChild());
		}
	}
	
	public void posOrder (BinaryTree<T> tree) {
		if (tree != null) {
			posOrder(tree.getLeftChild());
			posOrder(tree.getRightChild());
			
			System.out.println(tree.getKey());
		}
		
	}
}
