import java.util.Scanner;
class Even_Odd{
	private int a ;
	public void set(int a)
	{
		this.a = a;
	}
	public void show()
	{
		if(a % 2 == 0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Even_Odd EO = new Even_Odd();
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		EO.set(a);
		EO.show();
	}
}
	
