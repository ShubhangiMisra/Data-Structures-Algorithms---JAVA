package assignment12_binaryTrees;

import lecture17_.BinaryTreeNode;
import lecture17_.BinaryTreeUse;
import stacksNqueues.QueueEmptyException;

public class RemoveLeaves {
	public static BinaryTreeNode<Integer> remove(BinaryTreeNode<Integer>root){
		if(root==null){
			return  null;
		}
		 if(root.left==null && root.right==null){
			
			return null;
		}

		root.left =remove(root.left);
		root.right = remove(root.right);
		return root;
		
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=BinaryTreeUse.takeInput();
		
		BinaryTreeUse.printI(remove(root));

	}
}

//}12 6 7 1 4 9 -1 -1 -1 -1 -1 -1 -1
