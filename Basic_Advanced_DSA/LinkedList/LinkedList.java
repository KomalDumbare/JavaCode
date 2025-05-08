class Node{
	public int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
class LinkedList{
	public static void main(String[] args)
	{
		Node n1 = new Node(10);
		n1.next= new Node(20);
		n1.next.next = new Node(30);
		n1.next.next.next = new Node(40);
		
		Node temp = n1;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
	}
}
