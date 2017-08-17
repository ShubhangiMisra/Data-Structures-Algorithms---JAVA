package lecture19_maps_Hashtables;

import java.util.Scanner;

import lec13_dataStructures.Node;

public class MergeLLs {

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
			System.out.print(head.data+" ");
			head=head.next;
		}
		
	}

	public static Node<Integer> mergeHalfs(Node<Integer>head){
		Node<Integer>temp=head;
		Node<Integer>tem=head;
		Node<Integer>head1=head;
		int size=0;
		while(temp.next!=null){
			temp=temp.next;
			size++;
		}
		size++;
		
		Node<Integer>temp1=head;
		for(int i=1;i<=size/2 ;i++){
			temp1=temp1.next;	
		}
		Node<Integer>head2=temp1.next;
		temp1.next=null;
		for(int j=1;j<=size/2;j++){
			while(head1!=null && head2!=null && head1.next!=null && head2.next!=null){
				Node<Integer>tempI=head2.next;
				head2.next=head1.next;
				head1.next=head2;
				head1=head1.next.next;
				head2=tempI;
			}
			head1.next=head2;
			

		}
		head1.next=temp1;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head=takeInput();
		print(mergeHalfs(head));




	}

}
