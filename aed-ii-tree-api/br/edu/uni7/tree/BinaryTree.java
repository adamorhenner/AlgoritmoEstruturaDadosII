package br.edu.uni7.tree;

public class BinaryTree <T> {
	private T key;
	private BinaryTree<T> leftChild;
	private BinaryTree<T> rightChild;
	
	public BinaryTree(T rootObj) {
		this.key = rootObj;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	public void insertLeft(T newNode) {
		if (this.leftChild == null) {
			this.leftChild = new BinaryTree<T>(newNode);
		} else {
			BinaryTree<T> t = new BinaryTree<T>(newNode);
			t.leftChild = this.leftChild;
			this.leftChild = t;
		}
		
	}
	public void insertRight(T newNode) {
		if (this.rightChild == null) {
			this.rightChild = new BinaryTree<T>(newNode);
		} else {
			BinaryTree<T> t = new BinaryTree<T>(newNode);
			t.rightChild = this.rightChild;
			this.rightChild = t;
		}
		
	}
	
	
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	
	public BinaryTree<T> getRightChild() {
		return rightChild;
	}
	
	public T getKey() {
		return key;
	}
	
	public void setKey(T key) {
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
