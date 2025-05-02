class Minimum_Maximum{
	private int arr[];
	private int n;
	Minimum_Maximum(int arr[],int n)
	{
		this.arr = arr;
		this.n = n;
	}
	public void getMin()
	{
		int Min_Value = arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i] < Min_Value)
			{
				Min_Value = arr[i];
			}
		}
		System.out.println("the minimum value is: "+Min_Value);
	}
	public void getMax()
	{
		int Max_Value = arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i] > Max_Value)
			{
				Max_Value = arr[i];
			}
		}
		System.out.println("the maximum value is: "+Max_Value);
	}
	public static void main(String args[])
	{
		int arr[] = new int[]{30,10,20,50,12,56};
		int n = arr.length;
		Minimum_Maximum MM = new Minimum_Maximum(arr,n);
		MM.getMin();
		MM.getMax();
		
	}
	
}