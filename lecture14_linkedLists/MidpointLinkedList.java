package lecture14_linkedLists;

import java.util.Scanner;

import lec13_dataStructures.Node;

public class MidpointLinkedList {
	public static Node<Integer> takeInput(){
		Scanner s=new Scanner(System.in);
		Node<Integer>head=null,tail=null;
		System.out.println("Enter data");
		int data=s.nextInt();

		while(data!=-1){
			Node<Integer>newNode=new Node<Integer>(data);
			if(head==null){
				head=newNode;
				tail=newNode;
			}
			else{
				tail.next=newNode;
				tail=newNode;
			}
			System.out.println("enter data:");
			data=s.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head){
		while(head!=null){
			System.out.print(head.data+"->");
			head=head.next;
		}
	}
	
	public static Node<Integer> midPoint(Node<Integer> head){
	     Node<Integer> slow=head;
	     Node<Integer> fast=head;
	     while(fast.next!=null && fast.next.next!=null){
	    	 fast=fast.next.next;
	    	 slow=slow.next;
	     }
	     return slow;
	       
	     }
	     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head=takeInput();
		System.out.println(midPoint(head).data);
		
		

	}

}
