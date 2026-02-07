package LinkedList;


class Node{
	
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		this.next = null;
		
	}
}


class LinkedList{
	
	Node head;
	
	void printList() {
		Node temp = head;
		if(temp == null) {
			System.out.println("List is empty");
			return;
		}
		
		while(temp != null) {
			System.out.println(temp.data + " -> ");
			temp = temp.next;
		}
		
		System.out.println("null");
	}
}




public class CreateNode {

	//create Node + empty linkedList and print
	
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		list.printList();
	}
}
