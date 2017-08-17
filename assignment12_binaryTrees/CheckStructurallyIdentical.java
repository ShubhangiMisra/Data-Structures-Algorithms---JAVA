package assignment12_binaryTrees;

import lecture17_.BinaryTreeNode;
import lecture17_.BinaryTreeUse;
import stacksNqueues.QueueEmptyException;

public class CheckStructurallyIdentical {

	public static boolean check(BinaryTreeNode<Integer>root1,BinaryTreeNode<Integer>root2){
		if(root1.data!=root2.data){
			return false;
		}
		if(root1=null && root2==null){
			return true;
		}



	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root1=BinaryTreeUse.takeInput();
		BinaryTreeNode<Integer>root2=BinaryTreeUse.takeInput();

		System.out.println(check(root1,root2));

	}

}
