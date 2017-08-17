package lecture17_;

import java.util.Scanner;

import stacksNqueues.QueueEmptyException;

public class FindNode {

	public static BinaryTreeNode<Integer> find(int x,BinaryTreeNode<Integer>root){
		if(root==null){
			return null;
		}
		if(root.data==x){
			return root;
		}

		BinaryTreeNode<Integer>findLeft=find(x,root.left);
		if(findLeft!=null){
		return findLeft;
		}
		BinaryTreeNode<Integer>findRight=find(x,root.right);
		
		return findRight;
		
		

	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter data to find");
		int x=s.nextInt();
		BinaryTreeNode<Integer>root=BinaryTreeUse.takeInput();
		BinaryTreeNode<Integer>ans=find(x,root);
		System.out.println(ans);

	}

}
