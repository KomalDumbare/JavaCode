// Max of Array:
class Array_Max{
	public void show()
	{
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 5;
		arr[2] = 3;
		int ans = 0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] > ans){
				ans = arr[i];
			}
		}
		System.out.println("The maximum element of the array: "+ans);
	}
	public static void main(String[] args)
	{
		Array_Max A = new Array_Max();
		A.show();
	}
}