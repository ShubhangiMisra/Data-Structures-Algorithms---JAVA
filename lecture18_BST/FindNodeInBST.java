package lecture18_BST;

import java.util.Scanner;

import lecture17_.BinaryTreeNode;
import lecture17_.BinaryTreeUse;
import stacksNqueues.QueueEmptyException;

public class FindNodeInBST {
	
	public static BinaryTreeNode<Integer> find(BinaryTreeNode<Integer>root,int i){
		if(root==null){
			return null;
		}
		if(root.data==i){
			return root;
		}
		 if(root.data<i){
			 return find(root.right, i);
		 }
		 else{
			 return find(root.left,i);
		 }
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
//		8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1 
		BinaryTreeNode<Integer>root=BinaryTreeUse.takeInput();
		Scanner s=new Scanner(System.in);
		System.out.println("enter no. to search");
		int i=s.nextInt();
		System.out.println(find(root,i));

	}

}
