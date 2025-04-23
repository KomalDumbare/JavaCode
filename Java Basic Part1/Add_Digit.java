import java.util.Scanner;
class Add_Digit{
	private int digit;
	private int sum = 0;
	public void Add(int digit)
	{
		this.digit = digit;
	}
	public void show(){
		if(digit!=0)
		{
			digit = (digit / 10) + 1;
			digit = digit % 10;
			sum = sum + (digit*10);
		}
		System.out.println("The sum of all number is: "+sum);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Add_Digit AD = new Add_Digit();
		System.out.println("Enter the five digit number: ");
		int digit = sc.nextInt();
		AD.Add(digit);
		AD.show();
	}
}
