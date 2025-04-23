//For loop:
/* 
class Even_Number{
	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i+ " ");
			}
		}
	}
}
*/

//while loop:
/*
class Even_Number{
	public static void main(String[] args)
	{
		int i = 0;
		while(i<=100)
		{
			if(i % 2 == 0)
			{
				System.out.print(i+ " ");
			}
			i++;
		}
	}
}
*/

//do-while loop:
class Even_Number{
	public static void main(String[] args)
	{
		int i = 1;
		do
		{
			if(i % 2 == 0)
			{
				System.out.print(i+ " ");
			}
			i++;
		}while(i<=100);
	}
}