package stacksNqueues;

import java.util.Scanner;

import lec13_dataStructures.Node;

public class StackLL_Use {
	
	public static StackUsingLinkedList<Integer> stackInput(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of stack");
		int size=s.nextInt();
		
		StackUsingLinkedList<Integer> stack=new StackUsingLinkedList<>();
		for(int i=0;i<size;i++){
			System.out.println("enter element");
			int element=s.nextInt();
			stack.push(element);
			
		}
		return stack;
	}
	
	public static void printStack(StackUsingLinkedList<Integer>stack) throws StackEmptyException{
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}
	

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub
        StackUsingLinkedList<Integer> stack=new StackUsingLinkedList<>();
        for(int i=0;i<5;i++){
        	stack.push(i);
        }
        
//        System.out.println(stack.size());
        System.out.println(stack.top());
        
        while(!stack.isEmpty()){
        	System.out.println(stack.pop());
        }
        System.out.println(stack.size());
//        System.out.println(stack.top());
	}

}
