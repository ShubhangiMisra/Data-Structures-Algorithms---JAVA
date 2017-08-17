package stacksNqueues;

import java.util.Scanner;

public class CheckIfBracketsBalanced {
	
	public static boolean check(String str) throws StackEmptyException{
		int i=0;
		StackUsingLinkedList<Character>stack=new StackUsingLinkedList<>();
		while(i<str.length()-1){
			if(str.charAt(i)=='('|| str.charAt(i)=='{'|| str.charAt(i)=='['){
				stack.push(str.charAt(i));
			}
			if(stack.top()=='(' && str.charAt(i)==')'){
				stack.pop();
			}
			if(stack.top()=='{' && str.charAt(i)=='}'){
				stack.pop();
			}
			if(stack.top()=='[' && str.charAt(i)==']'){
				stack.pop();
			}
			i++;
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.next();
		System.out.println(check(str));
	
		
        
	}

}
