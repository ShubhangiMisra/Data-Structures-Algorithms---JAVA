package lecture18_BST;

import lec13_dataStructures.LinkedListUse;
import lec13_dataStructures.Node;
import lecture17_.BinaryTreeNode;
import lecture17_.BinaryTreeUse;
import stacksNqueues.QueueEmptyException;

public class ConvertBST_into_SortedLL {

	public static Node<Integer> convert(BinaryTreeNode<Integer>root){
		if(root==null){
			return null;
		}
		Node<Integer>rootLL=new Node<Integer>(root.data);
		
		if(root.left!=null){
			Node<Integer>head=convert(root.left);
			Node<Integer>temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}

			temp.next=rootLL;
			
			rootLL.next=convert(root.right);
			return head;
		}
		rootLL.next=convert(root.right);
		return rootLL;
	
}


public static void main(String[] args) throws QueueEmptyException {
	// TODO Auto-generated method stub
	BinaryTreeNode<Integer>root=BinaryTreeUse.takeInput();
	LinkedListUse.print(convert(root));

}

}
