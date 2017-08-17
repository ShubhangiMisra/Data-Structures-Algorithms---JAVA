package assignment13_BST;

import java.util.Scanner;

import lecture17_.BinaryTreeNode;
import lecture17_.BinaryTreeUse;
import stacksNqueues.QueueEmptyException;

public class CheckForSumX {
	public static boolean check(BinaryTreeNode<Integer>root,int x){
		if(root==null){
			return false;
		}
		
		return check(root.left, x) || check(root.right, x);

	}




	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("enter x");
		int x=s.nextInt();
		BinaryTreeNode<Integer>root=BinaryTreeUse.takeInput();
		System.out.println(check(root, x));


	}

}
