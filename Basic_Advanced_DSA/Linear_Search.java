import java.util.Scanner;
class Linear_Search{
	private int[] arr;
	private int target;
	public void set(int[] arr,int target)
	{
		this.arr = arr;
		this.target = target;
	}
	public int get()
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == target)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int arr[] = new int[]{2,5,10,68,78,90};
		int target = 10;
		Linear_Search LS = new Linear_Search();
		LS.set(arr,target);
		int result = LS.get();
		if(result == -1)
		{
			System.out.println("The required element is not found: "+result);
		}
		else
		{
			System.out.println("The required element is found at position : "+result);
		}
		
	}
}
