import java.util.Scanner;
class Array_Ascending{
	private int n;
	private int ele;
	public void set(int n)
	{
		this.n = n;
		this.ele = ele;
	}
	public void show()
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[n];
		for(int i = 0; i<n; i++)
		{
			arr[i]  = sc.nextInt();
		}
		for(int i=0; i<n; i++)
		{
			for(int j=0;j< n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		for(int E : arr)
		{
			System.out.println(E);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Array_Ascending AA = new Array_Ascending();
		System.out.println("Enter the number of element you want: ");
		int n = sc.nextInt();
		AA.set(n);
		AA.show();
	}
}