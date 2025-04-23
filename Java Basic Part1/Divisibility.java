import java.util.Scanner;
class Divisibility{
	private int a;
	public void set(int a)
	{
		this.a = a;
	}
	public void show()
	{
		if( a % 5 == 0 && a % 11 == 0)
			System.out.println("The number is divisible by 5 and 11: "+a);
		else 
			System.out.println("The number is not divisible by 5 and 11: "+a);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Divisibility D = new Divisibility();
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		D.set(a);
		D.show();
	}
}