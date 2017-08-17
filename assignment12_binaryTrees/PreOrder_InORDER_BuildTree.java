package assignment12_binaryTrees;

import lecture16_trees.TreeNode;
import lecture17_.BinaryTreeNode;
import lecture17_.BinaryTreeUse;
import lecture3Arrays.ArrayInput;

public class PreOrder_InORDER_BuildTree {
	
	public static BinaryTreeNode<Integer> build(int []pre,int[]in,int inS,int inE,int preS,int preE){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []pre=ArrayInput.takeInput();
		int []inOrder=ArrayInput.takeInput();
		BinaryTreeUse.printI(build(pre,inOrder));
		
		

	}

}
