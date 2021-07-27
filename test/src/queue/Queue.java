package queue;

public class Queue {
	int queue[]=new int[7];
	int rear;
	int size;
	int front;
	
	public void enqueue(int data) {
		if(size==queue.length) {
			System.out.println("Queue is full");
		}
		else {
		queue[rear] = data;
		rear =(rear+1)%7;
		size+=1;}
	}
	
	public int dequeue() {
		int data = queue[front];
		front=(front+1)%7;
		size -=1;
		return data;
	}
	
	public void show() {
		System.out.println();
		for(int i=0;i<size;i++) {
			System.out.println(queue[(front+i)%7]);
		}
	}
}
