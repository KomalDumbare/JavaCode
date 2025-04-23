import java.util.Scanner;
class HCF{
	private int number1;
	private int number2;
	public void set(int number1,int number2)
	{
		this.number1 = number1;
		this.number2 = number2;
	}
	public void show()
	{
		while(number1 != number2 )
		{
			if(number1 > number2)
				number1 = number1 - number2;
			if(number2 > number1)
				number2 = number2 - number1;
		}
		System.out.println("GCD: "+number1);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int number1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int number2 = sc.nextInt();
		HCF G = new HCF();
		G.set(number1,number2);
		G.show();
	}
	

}