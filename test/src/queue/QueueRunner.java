package queue;

public class QueueRunner {

	public static void main(String[] args) {
		Queue q = new Queue();
		
		/*
		 * q.enqueue(2); q.enqueue(2); q.enqueue(4); q.enqueue(7);
		 */
		q.enqueue(14);
		q.enqueue(1);
		q.enqueue(170);
		q.enqueue(17);
		q.enqueue(4);
		q.enqueue(7);
		q.enqueue(106);
		q.show();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		///
		q.enqueue(172);
		q.enqueue(164);
		q.enqueue(176);
		q.enqueue(167);
		q.enqueue(17);
		q.enqueue(16);
		q.show();

	}

}
