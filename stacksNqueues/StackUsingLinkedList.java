package stacksNqueues;

import lec13_dataStructures.Node;

//import lec13_dataStructures.Node;

public class StackUsingLinkedList<T> {
	private Node<T> head;
	private int size;

	public void push(T element) {
		
		Node<T> top=new Node<T>(element);
		top.next=head;
		head=top;
		size++;
	}
	public boolean isEmpty(){
		
		return head==null;
	}
	public T top() throws StackEmptyException{
		if(head==null){
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		return head.data;
	}
	public T pop() throws StackEmptyException{
		if(head==null){
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		T temp=head.data;
		head=head.next;
		size--;
		return temp;
		
	}
	public int size() {
		 return size;
	}
}



