import java.util.*;
/* class Second_Highest{
	public static int Second2Highest(int arr[])
	{
		int n = arr.length;
		if(n < 2)
		{
			System.out.println("The invalid input");
		}
		
		Arrays.sort(arr);
		
		return arr[n-2];
	}
	public static void main(String[] args)
	{
		int arr[] = new int[]{5,2,8,54,35};
		Second_Highest SH = new Second_Highest();
		int result = Second2Highest(arr);
		System.out.println(result);
	}
} */




class Second_Highest{
	public static int Second2Highest(int arr[])
	{
		int n = arr.length;
		if(n < 2)
		{
			System.out.println("The invalid input");
			return -1;
		}
		
		Arrays.sort(arr);
		for(int i =n-2; i>0; i--)
		{
			if(arr[i] != arr[n-1])
			{
				  return arr[i];
				
			}
		}
		System.out.println("The invalid input");
		return -1;
	}
	public static void main(String[] args)
	{
		int arr[] = new int[]{5,2,8,54,35,54,54,54};
		Second_Highest SH = new Second_Highest();
		int result = Second2Highest(arr);
		System.out.println(result);
	}
}
