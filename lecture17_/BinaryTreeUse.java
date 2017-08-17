package lecture17_;

import java.util.Scanner;

import stacksNqueues.QueueEmptyException;
import stacksNqueues.QueueUsingLinkedLists;

public class BinaryTreeUse {
	
	public static BinaryTreeNode<Integer> takeInput() throws QueueEmptyException{
		Scanner s=new Scanner(System.in);
		System.out.println("enter root");
		int rootData=s.nextInt();
		BinaryTreeNode<Integer>root=new BinaryTreeNode<>(rootData);
		QueueUsingLinkedLists<BinaryTreeNode<Integer>>q=new QueueUsingLinkedLists<>();
		q.enqueue(root);
		while(!q.isEmpty()){
			BinaryTreeNode<Integer>current=q.dequeue();
			System.out.println("enter left child");
			int leftData=s.nextInt();
			
			if(leftData!=-1){
			current.left=new BinaryTreeNode<Integer>(leftData);
			q.enqueue(current.left);
			}
			System.out.println("enter right child");
			int rightData=s.nextInt();
			
			if(rightData!=-1){
			current.right=new BinaryTreeNode<Integer>(rightData);
			q.enqueue(current.right);
			}
				
		}
		return root;
	}
	
	public static void printI(BinaryTreeNode<Integer>root) throws QueueEmptyException{
		QueueUsingLinkedLists<BinaryTreeNode<Integer>>q=new QueueUsingLinkedLists<>();
		q.enqueue(root);
		while(!q.isEmpty()){
			BinaryTreeNode<Integer>current=q.dequeue();
			String toBePrinted=current.data+":";
			if(current.left!=null){
				toBePrinted+=current.left.data+",";
				q.enqueue(current.left);
			}
			if(current.right!=null){
				toBePrinted+=current.right.data;
				q.enqueue(current.right);
			}
			System.out.println(toBePrinted);
		}
			
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=takeInput();
		printI(root);

	}//12 6 7 1 4 9 -1 -1 -1 -1 -1 -1 -1

}
