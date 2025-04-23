import java.util.Scanner;
class Gross_Salary_2{
	private double Basic_Salary;
	public void set(double Basic_Salary)
	{
		this.Basic_Salary = Basic_Salary;
	}
	public void show()
	{
		if(Basic_Salary < 1500)
		{
			double Salary = Basic_Salary + Basic_Salary * 0.1 + Basic_Salary * 0.9;
			System.out.println("The salary is: "+Salary);
		}
		else if(Basic_Salary >= 1500)
		{
			double Salary = Basic_Salary + 500 + Basic_Salary * 0.98;
			System.out.println("The salary is: "+Salary);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Gross_Salary_2 GS = new Gross_Salary_2();
		System.out.println("Enter the basic salary of the employee: ");
		double Basic_Salary = sc.nextDouble();
		GS.set(Basic_Salary);
		GS.show();
	}
}