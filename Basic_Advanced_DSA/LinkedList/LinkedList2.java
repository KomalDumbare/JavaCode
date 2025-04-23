class LinkedList2{
	Node Head;
	class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	//add node at first or last
	public void addFirst(int data)
	{
		Node newNode = new Node(data);
		if(Head == null)
		{
			Head = newNode;
			return;
		}
		newNode.next = Head;
		Head = newNode;
	}
	
	public void addLast(int data)
	{
		Node newNode = new Node(data);
		if(Head == null)
		{
			Head = newNode;
			return;
		}
		Node currNode = Head;
		while(currNode.next != null)
		{
			currNode = currNode.next;
		}
		currNode.next = newNode;
		
	}
	//Printing a linked List
	public void print()
	{
		if(Head == null)
		{
			System.out.println("Linked List is empty");
			return;
		}
		
		Node currNode = Head;
		while(currNode != null)
		{
			System.out.print(currNode.data+ "->");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	public static void main(String[] args)
	{
		LinkedList2 list = new LinkedList2();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.print();
		list.addLast(50);
		list.addLast(60);
		list.print();
	}
}