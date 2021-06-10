package br.edu.uni7.tree;

public class TreeNode {
	private Integer key;
	private Object payLoad;
	private TreeNode leftChild;
	private TreeNode rightChild;
	private TreeNode parent;
	
	public TreeNode(Integer key, Object payLoad) {
		this(key,payLoad, null, null, null);
	}
	
	public TreeNode(Integer key, Object payLoad, TreeNode leftChild, TreeNode rightChild, TreeNode parent) {
		this.key = key;
		this.payLoad = payLoad;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.parent = parent;
	}
	
	public boolean hasLeftChild() {
		boolean result = false;
		
		if(leftChild != null) {
			result = true;
		}
		return result;
	}
	
	public boolean hasRightChild() {
		return rightChild != null;
	}
	
	public boolean isLeftChild() {
		boolean result = false;
		
		if ((parent != null) && (parent.leftChild == this)) {
			result = true;
		}
		
		
		return result;
	}
	
	public boolean isRighftChild() {
		boolean result = false;
		
		if ((parent != null) && (parent.rightChild == this)) {
			result = true;
		}
		
		return result;
	}
	
	public boolean isRoot() {
		return parent == null;
	}
	
	public boolean isLeaf() {
		return (leftChild == null) && (rightChild == null);
	}
	
	public boolean hasAnyChildren() {
		return (rightChild != null) || (leftChild != null)
	}
	
	public boolean hasBothChildren() {
		return (rightChild != null) && (leftChild != null)
	}

	public void replaceNodeData(Integer key, Object payLoad, TreeNode left, TreeNode right) {
		this.key = key;
		this.payLoad = payLoad;
		this.leftChild = left;
		this.rightChild = right;
		
		if (hasLeftChild()) {
			this.leftChild.parent = this;
		}
		
		if (hasRightChild()) {
			this.rightChild.parent = this;
		}
	}
}
