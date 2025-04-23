class LinkedListDelete{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	public void addFirst(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	public void deleteFirst(int data)
	{
		Node currNode = head;
		if(head == null)
		{
			System.out.println("The linked list is empty");
			return;
		}
		currNode.next = head;
		
	}
	
	public void deleteLast(int data)
	{
		Node SecondLast = head;
		Node lastNode = head.next;
		if(head.next == null)
		{
			head = null;
			return;
		}
		while(lastNode.next != null)
		{
			SecondLast = SecondLast.next;
			lastNode = lastNode.next;
		}
		SecondLast.next = null;
		
	}
public void print()
	{
		if(head == null)
		{
			System.out.println("Linked List is empty");
			return;
		}
		
		Node currNode = head;
		while(currNode != null)
		{
			System.out.print(currNode.data+ "->");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	public static void main(String args[])
	{
		LinkedListDelete ll = new LinkedListDelete();
		ll.addFirst(50);
		ll.addFirst(40);
		ll.addFirst(30);
		ll.addFirst(20);
		ll.addFirst(10);
		ll.print();
		ll.deleteFirst(50);
		ll.print();
		
	}
	
}
