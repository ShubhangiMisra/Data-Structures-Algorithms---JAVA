package lecture16_trees;

import java.util.Scanner;

import stacksNqueues.QueueEmptyException;
import stacksNqueues.QueueUsingLinkedLists;
import stacksNqueues.StackUsingLinkedList;

public class TreeUse {

	public static TreeNode<Integer> takeInput() throws QueueEmptyException{
		Scanner s=new Scanner(System.in);
		System.out.println("enter root");
		int rootData=s.nextInt();
		TreeNode<Integer> root=new TreeNode<Integer>(rootData);
		QueueUsingLinkedLists<TreeNode<Integer>> pending =new QueueUsingLinkedLists<>();
		pending.enqueue(root);

		while(!pending.isEmpty()){
			TreeNode<Integer>current=pending.dequeue();
			System.out.println("enter number of children of"+current.data);
			int  numChild=s.nextInt();
			for(int i=0;i<numChild;i++){
				System.out.println("enter"+i+"child of"+current.data);
				int childData=s.nextInt();
				TreeNode<Integer> child=new TreeNode<Integer>(childData);
				current.children.add(child);
				pending.enqueue(child);	
			}
		}
		
		return root;

	}

	public static void printIterative(TreeNode<Integer> root) throws QueueEmptyException{
		QueueUsingLinkedLists<TreeNode<Integer>> pending=new QueueUsingLinkedLists<>();
		
		pending.enqueue(root);
		
		while(!pending.isEmpty()){
			TreeNode<Integer>current=pending.dequeue();
			String toBePrinted=current.data+":";
			for(int i=0;i<current.children.size();i++){
				toBePrinted+=current.children.get(i).data+",";
				pending.enqueue(current.children.get(i));

			}
			System.out.println(toBePrinted);
		}

	}
	

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		TreeNode<Integer> root=takeInput();
		
		printIterative(root);
	}
	//	1 3 2 3 4 1 5 1 6 1 7 0 0 0

}
