import java.util.Scanner;
class Natural_Sum{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value you want to find the sum: ");
		int num = sc.nextInt();
		int sum = num * (num + 1) / 2;
		System.out.println("Sum: "+sum);
	}
}