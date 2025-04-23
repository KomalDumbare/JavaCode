import java.util.Scanner;
class Descending_Array{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Descending_Array DA = new Descending_Array();
		System.out.println("Enter the number of element do you want to enter: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the element according to your choice: ");
		for(int i = 0; i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}