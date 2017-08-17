package assignment9;

import java.util.Scanner;

import lec13_dataStructures.LinkedListUse;
import lec13_dataStructures.Node;

public class InsertAtIthRecursively {
	
	public static Node<Integer> insertion(Node<Integer>head,int i,Node<Integer>newNode){
		
		if(i==1){
			newNode.next=head;
			head=newNode;
			return head;
		}
		head.next=insertion(head.next, i-1,newNode);
		return head;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=LinkedListUse.takeInput();
	//  print(head);
		Scanner s=new Scanner(System.in);

		System.out.println("Enter data to insert at i");
		int data=s.nextInt();
		Node<Integer> newNode=new Node<Integer>(data);
		
		System.out.println("enter int i");
		int i=s.nextInt();
		LinkedListUse.print(insertion(head, i,newNode));


	}

}
