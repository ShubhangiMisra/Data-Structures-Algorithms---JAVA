package assignment9;

import lec13_dataStructures.LinkedListUse;
import lec13_dataStructures.Node;

public class ReverseLL_Recursion {

	public static Node<Integer> reverse(Node<Integer>head){
		if(head.next==null){
			return head;
		}
		
		Node<Integer>revSmall=reverse(head.next);
		Node<Integer>temp=revSmall;

		while(temp.next!=null){
			temp=temp.next;
		}
		head.next=null;
		temp.next=head;
		
		return revSmall;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head=LinkedListUse.takeInput();
		LinkedListUse.print(reverse(head));


	}

}
