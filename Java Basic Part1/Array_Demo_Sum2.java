class Array_Demo_Sum2{
	public static void main(String args[])
	{
	//Direct Initialization
		int [] marks ={78,95,80,85,90} ;
		/*marks[0] = 78;
		marks[1] = 95;
		marks[2] = 80;
		marks[3] = 85;
		marks[4] = 90;*/
		int sum = 0,count=0;
		for(int i =0;i<marks.length;i++)
		{
			sum = sum+marks[i];
			if(marks[i]> 80)
			{
				System.out.println("marks: "+marks[i]);
				count++;
			}
			
		}
		System.out.println("Sum is: "+sum);
		System.out.println("Count: "+count);
	}
}