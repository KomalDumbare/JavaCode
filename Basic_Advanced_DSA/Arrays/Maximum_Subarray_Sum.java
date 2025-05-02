import java.util.*;
class Maximum_Subarray_Sum
{
	private int arr[];
	private int n;
	Maximum_Subarray_Sum(int arr[], int n)
	{
		this.arr = arr;
		this.n = n;
	}
	public void getMaxSum()
	{
		int MaxSum = 0;
		for(int i=0; i<n; i++)
		{
			int Sum = 0;
			for(int j=i; j<n; j++)
			{
				Sum += arr[j];
				MaxSum = Math.max(Sum,MaxSum);
			}
			
		}
		System.out.println(MaxSum);
	}
	public static void main(String args[])
	{
		int arr[] = new int[]{-1,3,4,-2};
		int n = arr.length;
		Maximum_Subarray_Sum MS = new Maximum_Subarray_Sum(arr,n);
		MS.getMaxSum();
	}
}