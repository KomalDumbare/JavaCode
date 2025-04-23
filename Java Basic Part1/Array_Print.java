// Array : Array Practice Start 1
import java.util.Scanner;
class Item_Price
{
	private float quantity;
	private float price;
	private float Total_Price;
	public void set(float quantity,float price)
	{
		this.quantity = quantity;
		this.price = price;
	}
	public void get()
	{
		if(quantity > 100)
		{
			Total_Price = quantity * price * 0.1;
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
		
	}

