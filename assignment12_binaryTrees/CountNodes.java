package assignment12_binaryTrees;

import lecture17_.BinaryTreeNode;
import lecture17_.BinaryTreeUse;
import stacksNqueues.QueueEmptyException;

public class CountNodes {
	
	public static int count(BinaryTreeNode<Integer> root){
		if(root==null){
			return 0;
		}
		int countLeft=count(root.left);
		int countRight=count(root.right);
		return countLeft+countRight+1;
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=BinaryTreeUse.takeInput();
		System.out.println(count(root));

	}

}
