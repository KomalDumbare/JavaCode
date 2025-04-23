import java.util.Scanner;
class Multi_table{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want the multiplication table: ");
		int num = sc. nextInt();
		for(int i = 1; i<=10; i++)
		{
			int table = i * num;
			System.out.println(table);
		}
	}
}