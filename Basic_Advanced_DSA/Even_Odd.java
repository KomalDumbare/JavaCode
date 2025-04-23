import java.util.Scanner;
class Even_Odd 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		if(num % 2 == 0)
		{
			System.out.println("The enter number is even: "+num);
		}
		else
		{
			System.out.println("The Enter number is odd: "+num);
		}
	}

}