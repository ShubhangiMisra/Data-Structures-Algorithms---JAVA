package assignment12_binaryTrees;

import lecture17_.BinaryTreeNode;
import lecture17_.BinaryTreeUse;
import stacksNqueues.QueueEmptyException;

public class CountLeafNodes {
	
	public static int count(BinaryTreeNode<Integer>root){
		if(root==null){
			return 0;
		}
		if(root.left==null && root.right==null){
			return 1;
		}
		int countLeft=count(root.left);
		int countRight=count(root.right);
		return countLeft+countRight;
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=BinaryTreeUse.takeInput();
		System.out.println(count(root));
	}
}

	

//}12 6 7 1 4 9 -1 -1 -1 -1 -1 -1 -1
