package assignment11_trees;

import java.util.Scanner;

import lecture16_trees.TreeNode;
import lecture16_trees.TreeUse;
import stacksNqueues.QueueEmptyException;

public class FindNodesGreaterThanX {
	
	public static int count(TreeNode<Integer>root,int x){
		if(root==null){
			return 0;
		}
		
		int num=0;
		for(int i=0;i<root.children.size();i++){
			num+=count(root.children.get(i), x);
		}
		if(root.data>x){
			num+=1;
		}
		return num;
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("enter x");
		int x=s.nextInt();
		TreeNode<Integer>root=TreeUse.takeInput();
		System.out.println(count(root, x));

	}

}
