class Reverse_Arrays{
	private int arr[];
	private int n;
	Reverse_Arrays(int arr[],int n)
	{
		this.arr = arr;
		this.n = n;
	}
	public void getRarray()
	{
		for(int i=n-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[])
	{
		int arr[] = new int[]{10,20,30,40,50};
		int n = arr.length;
		Reverse_Arrays RA = new Reverse_Arrays(arr,n);
		RA.getRarray();
	}
}