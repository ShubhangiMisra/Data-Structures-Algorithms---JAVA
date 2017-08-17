package stacksNqueues;

public class ReverseStackWithEmptyStack {
	
	public static StackUsingLinkedList<Integer> revStack(StackUsingLinkedList<Integer>stack) throws StackEmptyException{
		StackUsingLinkedList<Integer> reversed=new StackUsingLinkedList<>();
		while(!stack.isEmpty()){
			reversed.push(stack.pop());
		}
		return reversed;
	}

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub
		StackUsingLinkedList<Integer> stack = StackLL_Use.stackInput();
		StackLL_Use.printStack(revStack(stack));
		
		

	}

}
