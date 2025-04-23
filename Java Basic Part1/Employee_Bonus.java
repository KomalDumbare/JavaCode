import java.util.Scanner;
class Employee_Bonus{
	private int Enter_year;
	private int Long_year;
	public void set(int Enter_year,int Long_year)
	{
		this.Enter_year = Enter_year;
		this.Long_year = Long_year;
	}
	public void show()
	{
		int diff = Long_year - Enter_year;
		System.out.println("The difference between to years is: "+diff);
		if(diff > 3)
		{
			int Bonus = 2500;
			System.out.println("Congratualation Guys you get a bonus of rs 2500");
		}
		else
		{
			System.out.println("Sorry Guys you are not serve the company for 3 years so you are not getting any bonus");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Employee_Bonus EB = new Employee_Bonus();
		System.out.println("Enter the year of entering in the organization of employee: ");
		int Enter_year = sc.nextInt();
		System.out.println("Enter the working current year of the employee: ");
		int Long_year = sc.nextInt();
		EB.set(Enter_year,Long_year);
		EB.show();
	}
}