package br.edu.uni7.tree;

public class BinarySearchTree {
	private TreeNode root;
	private int size;
	
	public BinarySearchTree() {
		this.root = null;
		this.size = 0;
	}
	
	public int lenght(){
		return size;
	}
	
	public TreeNode getRoot() {
		return root;
	}
	
}
