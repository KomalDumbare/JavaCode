import java.util.Scanner;
class Print_Alternative{
	private int[] arr;
	public void set(int[] arr)
	{
		this.arr = arr;
	}
	public void get()
	{
		for(int i = 0; i<arr.length ; i+=2)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args)
	{
		int arr[] = new int[]{2,3,4,5,6,7,8,9};
		Print_Alternative PA = new Print_Alternative();
		PA.set(arr);
		PA.get();
		
		
	}
}