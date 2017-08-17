package assignment9;

import lec13_dataStructures.LinkedListUse;
import lec13_dataStructures.Node;

public class ReverseLL_recursiveC {
	
	public static Node<Integer> reverse(Node<Integer>head){
		if(head.next==null){
			return head;
		}
		Node<Integer>temp=head.next;
		Node<Integer>smallRev=reverse(head.next);
		temp.next=head;
		head.next=null;
		return smallRev;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head=LinkedListUse.takeInput();
		LinkedListUse.print(reverse(head));
		

	}

}
