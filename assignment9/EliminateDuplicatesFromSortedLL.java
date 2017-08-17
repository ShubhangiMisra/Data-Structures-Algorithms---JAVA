package assignment9;

import lec13_dataStructures.LinkedListUse;
import lec13_dataStructures.Node;

public class EliminateDuplicatesFromSortedLL {
	
	public static void eliminate(Node<Integer>head){
		Node<Integer>temp=head;
		
		while(temp!=null && temp.next!=null){
			while(temp!=null && temp.next!=null && temp.data==temp.next.data){
				temp.next=temp.next.next;	
			}	
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head=LinkedListUse.takeInput();
		eliminate(head);
		LinkedListUse.print(head);

	}

}
