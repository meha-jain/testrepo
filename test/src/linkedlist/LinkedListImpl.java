package linkedlist;

public class LinkedListImpl {

	public static void main(String[] args) {
		LinkedList customLL = new LinkedList();
		customLL.insert(5);
		customLL.insert(15);
		customLL.insert(25);
		customLL.insertAt(35,1);
		//customLL
		customLL.show(customLL);
		customLL.deleteAt(1);
		customLL.show(customLL);
	
	}

}
