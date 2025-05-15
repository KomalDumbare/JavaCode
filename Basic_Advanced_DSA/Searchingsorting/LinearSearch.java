// Linear search 
import java.util.Scanner;
class LinearSearch{
	private int[] arr;
	private int n;
	private int target;
	LinearSearch(int arr[], int n,int target)
	{
		this.arr = arr;
		this.n = n;
		this.target = target;
	}
	public void getTarget()
	
	{
		//To track the element count if the element is not found
		int temp=0;
		for(int i=0; i<n; i++)
		{
			if(arr[i] == target)
			{
				System.out.println("the index of the target value is"+i);
				temp++;
			}
		}
		if(temp==0)
		{
		System.out.println("Element is not found");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[]{12,10,8,6,5,9,2};
		int n = arr.length;
		System.out.println("Enter the Target value: ");
		int target = sc.nextInt();
		LinearSearch LS = new LinearSearch(arr,n,target);
		LS.getTarget();
	}
}