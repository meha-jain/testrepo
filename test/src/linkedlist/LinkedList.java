package linkedlist;

public class LinkedList {
	private Node head;


	public void insert(int i) {
		Node node = new Node();
		node.data = i;
		node.next = null;
		if(head == null) {
			head = node;
		}
		else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next=node;
		}
	}
	
	public void insertAt(int i, int j) {
		Node node = new Node();
		node.data = i;
		node.next = null;
		Node h = head;
		if(j == 0) {
			head = node;
		}
		else {
			Node n = h;
			
			for(int k=0; k<j-1;k++) {
				
				n = n.next;
			}
			node.next= n.next;
			n.next=node;
		}
	}
	 public void deleteAt(int i) {
		 if(i==0) {
			 head=head.next;
		 }
		 else {
			 Node n = head;
			 Node p = null;
			
			 for(int k=0; k<i-1;k++) {
					n = n.next;
				}
			 	p = n.next;
				n.next= p.next;
			
		 }
	 }
	public void show(LinkedList l) {
		Node n = head;
		while(n.next!=null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
}
