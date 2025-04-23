class LinkedList1{
	Node head;
	class Node
	{
		String data;
		Node next;
		Node(String data)
		{
			this.data = data;
			this.next = null;
		}
	}
	//add-First,last
	public void addFirst(String data)
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
	public void addLast(String data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next != null)
		{
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	//Print linked list
	public void print()
	{
		if(head == null)
		{
			System.out.println("Linked List Empty");
			return;
		}
		Node currNode = head;
		while(currNode != null)
		{
			System.out.print(currNode.data+ "->");
			currNode =currNode.next;
		}
		System.out.println("NULL");
	}
	public static void main(String[] args)
	{
		LinkedList1 List = new LinkedList1();
		List.addFirst("a");
		List.addFirst("is");
		List.print();
	}
}