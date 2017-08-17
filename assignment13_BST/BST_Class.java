package assignment13_BST;

import lecture17_.BinaryTreeNode;

public class BST_Class {
	
	private BinaryTreeNode<Integer>root;
	private int size=0;
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		if(size==0){
			return true;
		}
		return false;
	}
	
	public boolean search(BinaryTreeNode<Integer>root,int i){
		if(root.data==i){
			return true;
		}
		if(root.data>i){
			return search(root.data);
		}
		return search(i)
	}
	
}
