package lec13_dataStructures;

import java.util.Scanner;

public class LinkedListUse {
	
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
	public static void print(Node<Integer> head){
		while(head!=null){
			System.out.print(head.data+"->");
			head=head.next;
		}
	}
	public static void printIthElement(Node<Integer> head, int i){
		int pos=1;
		while(pos<i){
			head=head.next;
			pos++;
		}
		System.out.println(head.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
//        print(head);
		Scanner s=new Scanner(System.in);
		System.out.println("enter int i");
		int i=s.nextInt();
		printIthElement(head,i);
	}

}
