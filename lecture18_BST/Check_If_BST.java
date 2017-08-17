package lecture18_BST;

import lecture17_.BinaryTreeNode;
import lecture17_.BinaryTreeUse;
import stacksNqueues.QueueEmptyException;

public class Check_If_BST {

	public static boolean check(BinaryTreeNode<Integer>root){
		if(root==null){
			return true;
		}
		if(root.left!=null){
			if(root.left.data>root.data){
				return false;
			}
		}
			if(root.right!=null){
				if(root.right.data<root.data){
					return false;
				}	
			}
			
		if(check(root.left)==true){
			return check(root.right);
		}
		return check(root.left);


	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=BinaryTreeUse.takeInput();
		System.out.println(check(root));

	}

}
