package stacksNqueues;

import lec13_dataStructures.Node;

public class QueueUsingLinkedLists<T> {
	private Node<T> front;
	private Node<T> rear;
	int size;
	public boolean isEmpty(){
		return size==0;
	}
	public int size(){
		return size;
	}
	public T front() throws QueueEmptyException{
		if(size==0){
			QueueEmptyException e=new QueueEmptyException();
			throw e;
		}
		return front.data;
	}
	
	public T dequeue() throws QueueEmptyException{
		if(size==0){
			QueueEmptyException e=new QueueEmptyException();
			throw e;
		}
		  Node<T> temp=front;
		  front=front.next;
		  size--;
		  return temp.data;	    
	}
	
	public void enqueue(T element) {
		if(size==0){
			Node<T> input=new Node<T>(element);
			front=input;
			rear=input;
			size++;
		}
		else{
		Node<T> input=new Node<T>(element);
		rear.next=input;
		rear=rear.next;	
		size++;
		}
	}

}
