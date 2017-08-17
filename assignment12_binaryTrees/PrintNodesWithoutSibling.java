package assignment12_binaryTrees;

import lecture17_.BinaryTreeNode;
import lecture17_.BinaryTreeUse;
import stacksNqueues.QueueEmptyException;

public class PrintNodesWithoutSibling {
	
	public static void print(BinaryTreeNode<Integer>root){
		if(root==null){
			return;
		}
		if(root.left==null && root.right!=null){
			System.out.println(root.right.data);
		}
		else if(root.right==null && root.left!=null){
			System.out.println(root.left.data);
		}
		print(root.left);
		print(root.right);
		
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=BinaryTreeUse.takeInput();
		print(root);
		

	}

}
