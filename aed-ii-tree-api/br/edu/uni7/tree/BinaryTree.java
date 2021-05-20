package br.edu.uni7.tree;

public class BinaryTree {
	private String key;
	private BinaryTree leftChild;
	private BinaryTree rightChild;
	
	public BinaryTree(String rootObj) {
		this.key = rootObj;
		this.leftChild = null;
		this.rightChild = null;
		
	}
	
	public void insertLeft(String newNode) {
		if (this.leftChild == null) {
			this.leftChild = new BinaryTree(newNode);
		} else {
			BinaryTree t = new BinaryTree(newNode);
			t.leftChild = this.leftChild;
			this.leftChild = t;
		}
		
	}
	public void insertRight(String newNode) {
		if (this.rightChild == null) {
			this.rightChild = new BinaryTree(newNode);
		} else {
			BinaryTree t = new BinaryTree(newNode);
			t.rightChild = this.rightChild;
			this.rightChild = t;
		}
		
	}
	
	
	public BinaryTree getLeftChild() {
		return leftChild;
	}
	
	public BinaryTree getRightChild() {
		return rightChild;
	}
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	 
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("{").append(" ").append("'key': '").append(key).append("',");
		
		builder.append("'leftChild': ");
		if (leftChild != null) {
			builder.append(leftChild.toString());
		} else {
			builder.append("[]");
		}
		
		builder.append(", ");
		
		builder.append("'rightChild': ");
		if (rightChild != null) {
			builder.append(rightChild.toString());
		} else {
			builder.append("[]");
		}
		
		builder.append("}");
		
		return builder.toString();
		
	}
	
}
