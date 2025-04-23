//Linked List Structure in java: 1 
public class Basicll{
	public static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
		}
	}
	public static void main(String[] args)
	{
		Node a = new Node(3);
		Node b = new Node(9);
		Node c = new Node(12);
		Node d= new Node(15);
		Node e = new Node(18);
		a.next =b;
		b.next = c;
		c.next = d;
		d.next = e;
		//Without using any function
		/*System.out.println(a.next.data);
		System.out.println(a.next.next.data);
		System.out.println(a.next.next.next.data);
		System.out.println(a.next.next.next.next.data);*/
		// By using a for loop
		Node temp = a;
		/*for(int i = 1;i<=5;i++)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}*/
		// If the length of the linked list is not known 
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
			
		}
		
	}
}
	