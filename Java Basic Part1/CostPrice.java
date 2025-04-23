import java.util.Scanner;
class CostPrice{
	private int item = 15;
	private double total_Cost;
	private double profit;
	public void Cost(double total_Cost,double profit){
		this.total_Cost = total_Cost;
		this.profit = profit;
	}
	public void show(){
		double CP = (total_Cost * 100)/profit;
		System.out.println("Total cost price is: "+CP);
		double One_item_price = CP/item;
		System.out.println("One item price is: "+One_item_price);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		CostPrice P = new CostPrice();
		System.out.println("Enter the total cost of the items: ");
		double total_Cost = sc.nextDouble();
		System.out.println("Enter the profit of the items seller earn: ");
		double profit = sc.nextDouble();
		P.Cost(total_Cost,profit);
		P.show();
	}
}
		
		