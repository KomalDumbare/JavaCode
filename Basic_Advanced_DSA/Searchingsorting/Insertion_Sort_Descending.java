class Insertion_Sort_Descending{
	private int arr[];
	public Insertion_Sort_Descending(int arr[])
	{
		this.arr = arr;
	}
	public void Sort()
	{
		int temp,j;
		for(int i=1; i<arr.length;i++)
		{
			temp = arr[i];
			j = i;
			while(j>0 && temp>arr[j-1])
			{
				arr[j] = arr[j-1];
				j = j-1;
			}
			arr[j] = temp;
		}
	}
	public void print()
	{
		for(int i =0; i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
			
	}
	public static void main(String[] args)
	{
		int arr[] = new int[]{5,1,6,2,4,3};
		Insertion_Sort_Descending IS = new  Insertion_Sort_Descending(arr);
		IS.Sort();
		IS.print();
	}
		

}