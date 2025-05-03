//For finding the maximum sum of subarray.
class kadane_Algo{
	private int arr[];
	private int n;
	kadane_Algo(int arr[],int n)
	{
		this.arr = arr;
		this.n = n;
	}
	public void getSum()
	{
		int MaxSum = arr[0];
		int sum = 0;
		for(int i=0; i<n; i++)
		{
			if(sum >= 0)
				sum = sum + arr[i];
			else 
				sum = arr[i];
			if(sum > MaxSum)
			{
				MaxSum = sum;
			}
			
		}
		System.out.println("the MaxSum is: "+MaxSum);
	}
	public static void main(String[] args)
	{
		int arr[] = new int[]{5,6,-3,7,-13,8,-2,5,-6,7,-11,3,10,-1,-6,-10,7,2};
		int n = arr.length;
		kadane_Algo KA = new kadane_Algo(arr,n);
		KA.getSum();
	}
}