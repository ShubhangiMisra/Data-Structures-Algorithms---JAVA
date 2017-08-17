package lecture14_linkedLists;

import java.util.Scanner;

import lec13_dataStructures.Node;

public class MergeTwoSortedArrays {
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
	public static Node<Integer> merge(Node<Integer> head1,Node<Integer> head2){
		Node<Integer> head3=null,tail3=null;
		Node<Integer> temp1=head1,temp2=head2;
		if(temp1==null){
			return temp2;
		}
		if(temp2==null){
			return temp1;
		}
		if(temp1.data<temp2.data){
			head3=temp1;	
			tail3=temp1;
			temp1=temp1.next;
		}
		else{
			head3=temp2;
			tail3=temp2;
			temp2=temp2.next;
		}
		while(temp2!=null && temp1!=null){
			if(temp1.data<temp2.data){
				tail3.next=temp1;
				tail3=temp1;
				temp1=temp1.next;
			}
			else{
				tail3.next=temp2;
				tail3=temp2;
				temp2=temp2.next;	
			}	
		}
		if(temp2!=null){
			tail3.next=temp2;
		}
		else{
			tail3.next=temp1;
		}
		return head3;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head1=takeInput();
		Node<Integer>head2=takeInput();
		print(merge(head1, head2));
	}

}
