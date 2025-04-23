import java.util.Scanner;
import java.lang.Math;
class Absolute_value{
	private int x;
	public void set(int x)
	{
		this.x = x;
	}
	public void show()
	{
		int y = Math.abs(x - 0);
		
		if(y> 0)
		{
			System.out.println("The Absolute value of Enter number is: "+y);
		}
			
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Absolute_value AV = new Absolute_value();
		System.out.println("Enter the number x: ");
		int x = sc.nextInt();
		AV.set(x);
		AV.show();
	}

}