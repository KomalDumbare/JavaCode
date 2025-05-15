class Insertion_Sort{
	private int arr[];
	public Insertion_Sort(int arr[])
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
			while(j>0 && arr[j-1]>temp)
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
		Insertion_Sort IS = new  Insertion_Sort(arr);
		IS.Sort();
		IS.print();
	}
		

}