package lecture18_BST;

import java.util.ArrayList;
import java.util.Scanner;

import lecture17_.BinaryTreeNode;
import lecture17_.BinaryTreeUse;
import stacksNqueues.QueueEmptyException;

public class PathToANode {

	public static ArrayList<BinaryTreeNode<Integer>> findPath(BinaryTreeNode<Integer>root,int data){
		if(root==null){
			return null;
		}

		if(root.data==data){
			ArrayList<BinaryTreeNode<Integer>>ans=new ArrayList<>();
			ans.add(root);
			return ans; 
		}

		ArrayList<BinaryTreeNode<Integer>>ansLeft=findPath(root.left,data);
		if(ansLeft!=null ){
			ansLeft.add(root);
			return ansLeft;
		}
			ArrayList<BinaryTreeNode<Integer>>ansRight=findPath(root.right,data);
			if(ansRight!=null){
				ansRight.add(root);
				
			}
			return ansRight;
		
		
		
			
		}

	

	public static void main(String[] args) throws QueueEmptyException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter node ");
		int data=s.nextInt();
		BinaryTreeNode<Integer>root=BinaryTreeUse.takeInput();
		ArrayList<BinaryTreeNode<Integer> >result= findPath(root,data);

		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i).data);
		}

	}

}
