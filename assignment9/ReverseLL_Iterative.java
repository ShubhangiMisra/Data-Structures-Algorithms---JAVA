package assignment9;

import lec13_dataStructures.LinkedListUse;
import lec13_dataStructures.Node;

public class ReverseLL_Iterative {
	
	public static void reverse(Node<Integer>head){
		Node<Integer>temp=head;
		while(temp.next.next!=null ){
			temp=temp.next;
		}
		Node<Integer>prev=temp;
		Node<Integer>current=prev.next;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head=LinkedListUse.takeInput();
		
		LinkedListUse.print(head);

	}

}
