package lec13_dataStructures;

import java.util.Scanner;

public class LengthOfLinkedList {
	public static Node<Integer> takeInput(){
		Scanner s=new Scanner(System.in);
		Node<Integer>head=null,tail=null;
		System.out.println("Enter data");
		int data=s.nextInt();

		while(data!=-1){
			Node<Integer>newNode=new Node<>(data);
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
	public static int length(Node<Integer> head){
		int length=0;
		Node<Integer> temp=head;
		while(temp!=null){
			temp=temp.next;
			length++;
		}
		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
		
			
			System.out.println(length(head));


	}

}
