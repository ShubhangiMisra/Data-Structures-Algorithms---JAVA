package lecture18_BST;

import java.util.Scanner;

import lecture17_.BinaryTreeNode;
import lecture17_.BinaryTreeUse;
import stacksNqueues.QueueEmptyException;

public class PrintNodesBetweenK1_K2 {
	
	public static void print(BinaryTreeNode<Integer>root,int k1,int k2){
		if(root==null){
			return;
		}
		
		if(root.data>k2){
			print(root.left,k1,k2);
			return;
		}
		if(root.data<k1){
			print(root.right, k1, k2);
			return;
		}
		
			System.out.println(root.data);
			print(root.left,k1,k2);
			print(root.right,k1,k2);
		}
		
		
		
	

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		BinaryTreeNode<Integer>root=BinaryTreeUse.takeInput();
		System.out.println("enter k1");
		int k1=s.nextInt();
		System.out.println("enter k2");
		int k2=s.nextInt();
		print(root,k1,k2);
		

	}

}
