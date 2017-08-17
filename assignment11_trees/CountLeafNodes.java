package assignment11_trees;

import lecture16_trees.TreeNode;
import lecture16_trees.TreeUse;
import stacksNqueues.QueueEmptyException;

public class CountLeafNodes {
	
	public static int countLeaf(TreeNode<Integer>root){
		if(root==null){
			return 0;
		}
		if(root.children.size()==0){
			return 1;
		}
		int count=0;
		for(int i=0;i<root.children.size();i++){
			count+=countLeaf(root.children.get(i));
		}
		return count;
		
		
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		TreeNode<Integer>root=TreeUse.takeInput();
		System.out.println(countLeaf(root));

	}

}
