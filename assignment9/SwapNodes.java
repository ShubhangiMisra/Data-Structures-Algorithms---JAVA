package assignment9;

import java.util.Scanner;

import lec13_dataStructures.LinkedListUse;
import lec13_dataStructures.Node;

public class SwapNodes {
	
	public static Node<Integer> swap(Node<Integer>head,int i,int j){
		Node<Integer>node1=head;
		Node<Integer>node2=head;
		Node<Integer>prev1=head;
		Node<Integer>prev2=head;
		int pos1=1;
		while(pos1<i-1){
			prev1=prev1.next;
			pos1++;
		}
		node1=prev1.next;
		
		int pos2=1;
		while(pos2<j-1){
			prev2=prev2.next;
			pos2++;
		}
		node2=prev2.next;
		
		
		
		return head;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter int i");
		int i=s.nextInt();
		System.out.println("enter int j");
		int j=s.nextInt();
		Node<Integer>head=LinkedListUse.takeInput();
		LinkedListUse.print(swap(head, i, j));

	}

}
