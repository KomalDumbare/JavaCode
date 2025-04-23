import java.util.Scanner;
class Digit_Sum{
	public static int Sum_of_digit(int num)
	{
		int rem=0,sum=0;
		while(num!=0)
		{
			rem = num % 10;
			sum = sum + rem;
			num = num/10;
		}
	System.out.println("The sum of digit is: "+sum);
	return sum;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Digit_Sum SD = new Digit_Sum();
		System.out.println("Enter the five digit number: ");
		int num = sc.nextInt();
		SD.Sum_of_digit(num);
	}
}
		
		
	