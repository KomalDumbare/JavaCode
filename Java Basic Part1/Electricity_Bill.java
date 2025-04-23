import java.util.Scanner;
class Electricity_Bill{
	private double bill;
	public void set(double bill)
	{
		this.bill = bill;
	}
	public void show()
	{
		if(bill <= 50)
		{
			double total_bill = bill * 0.50 * 0.2;
			System.out.println("The total bill of the electricity is: "+total_bill);
		}
		else if(bill >50 && bill<=200)
		{
			double total_bill = bill * 0.75 * 0.2;
			System.out.println("The total bill of the electricity is:  "+total_bill);
		}
		else if(bill>200 && bill<=450)
		{
			double total_bill = bill * 1.20 * 0.2;
			System.out.println("The total bill of the electricity is: "+total_bill);
		}
		else
		{
			double total_bill = bill * 1.150 * 0.2;
			System.out.println("The total electricity bill is: "+total_bill);
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Electricity_Bill EB = new Electricity_Bill();
		System.out.println("Enter the bill price: ");
		double bill = sc.nextDouble();
		EB.set(bill);
		EB.show();
	}
}