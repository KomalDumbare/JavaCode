class AddFirstLL{
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
    public void AddFront(int data){
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	public void printList(){
		Node currNode = head;
		while(currNode != null)
		{
			System.out.print(currNode.data+" -> ");
			currNode = currNode.next;
		}
	}
	public static void main(String args[])
	{
		AddFirstLL n1 = new AddFirstLL();
		n1.AddFront(100);
		n1.AddFront(80);
		n1.AddFront(60);
		n1.AddFront(40);
		n1.AddFront(20);
		n1.printList();
	}
}