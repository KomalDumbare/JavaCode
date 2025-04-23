import java.util.Scanner;
/* class First_Last_Sum{
	public static int First_Last(int num)
	{
		int sum = 0,FD=num,LD;
		while(num>=10)
		{
			FD = FD/10;
		}
		System.out.println("The first number is : "+FD);
		LD = num%10;
		System.out.println("The last number is: "+LD);
		sum = FD + LD;
		
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		First_Last_Sum FDS = new First_Last_Sum();
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		FDS.First_Last(num);
		System.out.println("Sum of the first and last number of the digit is: "+sum);
	}
}*/
class NumberProcessor{
	private int number;
	public NumberProcessor(int number)
	{
		this.number = number;
	}
	public int sumFirstLastDigit(){
		int lastDigit = number % 10;
		int firstDigit = number;
		while(firstDigit >= 10)
		{
			firstDigit/=10;
		}
		return firstDigit + lastDigit;
	}
}
public class SumDigit{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		NumberProcessor processor = new NumberProcessor(num);
		System.out.println("Sum of first and last digit: "+processor.sumFirstLastDigit());
	}
}

