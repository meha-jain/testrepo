package stack;

public class StackRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.push(5);
		stack.push(15);
		stack.show();
		stack.push(25);
		stack.show();
		stack.push(35);
		stack.show();
		stack.pop();
		stack.show();
		stack.pop();
		stack.show();
		stack.pop();
		stack.show();
		stack.pop();
		stack.pop();
		stack.pop();
		
		/*
		 * stack.pop(); stack.show(); stack.pop(); stack.show(); stack.push(35);
		 * stack.show(); stack.push(5); stack.push(15); stack.push(25); stack.push(5);
		 * stack.push(15); stack.push(25);
		 */
//System.out.println(stack.peek());
	}

}
