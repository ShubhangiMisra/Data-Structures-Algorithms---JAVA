package assignment13_BST;

import lecture17_.BinaryTreeNode;
import lecture17_.BinaryTreeUse;
import stacksNqueues.QueueEmptyException;

public class InsertDuplicatesOnLeft {
	
	public static void insertDup(BinaryTreeNode<Integer>root){
		if(root==null){
			return ;
		}
		BinaryTreeNode<Integer>dup=new BinaryTreeNode<Integer>(root.data);
		BinaryTreeNode<Integer>temp=root.left;
		root.left=dup;
		dup.left=temp;
		insertDup(root.right);
		insertDup(dup.left);
		
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=BinaryTreeUse.takeInput();
		insertDup(root);
		BinaryTreeUse.printI(root);
		

	}

}
