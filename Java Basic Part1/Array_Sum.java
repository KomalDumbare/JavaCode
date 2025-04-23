// Sum of Array:
class Array_Sum{
	public void show()
	{
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 5;
		arr[2] = 3;
		int sum = 0;
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
			sum = sum+arr[i];
		}
		System.out.println("The sum of the array: "+sum);
	}
	public static void main(String[] args)
	{
		Array_Sum A = new Array_Sum();
		A.show();
	}
}