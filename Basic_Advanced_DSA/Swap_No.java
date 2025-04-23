import java.util.Scanner;
class Swap_No{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("The two numbers are: "+a+" "+b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Swap of Two Number: "+a+" "+b);
		
	}
}