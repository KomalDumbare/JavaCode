class Largest_Element{
	private int[] arr;
	public void set(int[] arr)
	{
		this.arr = arr;
	}
	public int get()
	{
		int Max = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > Max)
			{
				Max = arr[i];
			}
		}
		return Max;
	}
	public static void main(String[] args)
	{
		int[] arr = new int[]{10,68,110,200,20,50};
		Largest_Element LE = new Largest_Element();
		LE.set(arr);
		int result = LE.get();
		System.out.println("The element is: "+result);
	}
}