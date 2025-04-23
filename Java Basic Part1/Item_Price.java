import java.util.Scanner;
class Item_Price
{
	private int quantity;
	private float price;
	private float Total_Price;
	public void set(int quantity,float price)
	{
		this.quantity = quantity;
		this.price = price;
	}
	public void get()
	{
		if(quantity > 100)
		{
			Total_Price = quantity * price * (float)0.9;
		}
		else
		{
			Total_Price = quantity * price;
		}
	}
	public void show()
	{
		System.out.println("The total price of the item: "+Total_Price);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Item_Price I = new Item_Price();
		System.out.println("The the quantity of item: ");
		int quantity = sc.nextInt();
		System.out.println("Enter the price of the item: ");
		float price = sc.nextFloat();
		I.set(quantity,price);
		I.get();
		I.show();
	}
}

