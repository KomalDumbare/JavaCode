import java.util.Scanner;
class Factorial_Value{
	private int x;
	public void set(int x)
	{
		this.x = x;
	}
	public void show()
	{
		int fact = 1;
		for(int i = 1; i <= x; i++)
		{
			fact = fact * i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Factorial_Value FV = new Factorial_Value();
		System.out.println("Enter the value of x: ");
		int x = sc.nextInt();
		FV.set(x);
		FV.show();
		
	}
}