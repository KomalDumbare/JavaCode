class AddLastLL{
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
	public void addLast(int data)
	{
		Node newNode = new Node(data);
		if(Head == null)
		{
			Head = newNode;
			return;
		}
		Node end = Head;
		while(end.next != null)
		{
			end = end.next;
		}
		end.next = newNode;
	}
	public void print()
	{
		Node currNode = Head;
		while(currNode != null)
		{
			System.out.print(currNode.data+"->");
			currNode = currNode.next;
		}
		System.out.println("NULL");
		
	}
	public static void main(String[] args)
	{
		AddLastLL L1 = new AddLastLL();
		L1.addLast(10);
		L1.addLast(20);
		L1.addLast(30);
		L1.addLast(40);
		L1.print();
	}
}