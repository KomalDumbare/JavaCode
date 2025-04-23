import java.util.Scanner;
class Array_Avg{
	private int n;
	private int[] arr;
	public void set(int n,int[] arr)
	{
		this.n = n;
		this.arr = arr;
	}
	public void show()
	{
		int total = 0;
		int avg = 0;
		for(int i=0; i<n; i++)
		{
			total += arr[i];
		}
		avg = total / n;
		System.out.println("Average of the array: "+avg);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Array_Avg AA = new Array_Avg();
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		AA.set(n,arr);
		AA.show();
	}

}