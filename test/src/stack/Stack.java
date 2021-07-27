package stack;

public class Stack {
	
	int capacity = 2;
	int[] stack = new int[capacity];
	int top = 0;
	
	public void push(int i) {
		if(size()==capacity) {
			expand();
			stack[top] = i;
			top++;
		}
		else {
			
			stack[top] = i;
			top++;
		}
	}
	
	private void expand() {
		capacity *=2;
		int[] nstack = new int[capacity];
		System.arraycopy(stack, 0, nstack, 0, size());
		stack = nstack;
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	
	public void pop() {
		if(size()>0) {
		top--;
		stack[top] = 0;
		if(size()<=(capacity/2)/2) {
			shrink();
		}
		
			
		}
		else {
			System.out.println("stack full");
		}
	}
	
	private void shrink() {
		capacity /= 2;
		int[] nstack = new int[capacity];
		System.arraycopy(stack, 0, nstack, 0, size());
		stack = nstack;
	}
	
	
	public int peek() {
		return stack[top-1];
	}
	
	public void show() {
		for(int d : stack) {
			System.out.println(d);
		}
		
	}
	
}
