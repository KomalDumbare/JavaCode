import java.util.Scanner;
class Gross_Salary_Per{
	private double Basic_Salary;
	private double HRA;
	private double DA;
	private double GS;
	public void set(double Basic_Salary)
	{
		this.Basic_Salary = Basic_Salary;
		this.HRA = HRA;
		this.DA = DA;
	}
	public void get()
	{
		if(Basic_Salary <= 10000)
		{
			double House_Rent = Basic_Salary * 0.2;
			double Dearness_Allowance = Basic_Salary * 0.8;
			double GS = Basic_Salary + House_Rent + Dearness_Allowance;
			System.out.println("The overall salary of the user is: "+GS);
		}
		else if(Basic_Salary <= 20000){
			double House_Rent = Basic_Salary *0.25;
			double Dearness_Allowance = Basic_Salary * 0.9;
			double GS = Basic_Salary + House_Rent + Dearness_Allowance;
			System.out.println("The overall salary of the user is: "+GS);
		}
		else if(Basic_Salary > 20000)
		{
			double House_Rent = Basic_Salary * 0.3;
			double Dearness_Allowance = Basic_Salary * 0.95;
			double GS = Basic_Salary + House_Rent + Dearness_Allowance;
			System.out.println("The ovverall salary of the user is: "+GS);
		}
		else
		{
			System.out.println("You Enter the wrong value");
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Gross_Salary_Per GP = new Gross_Salary_Per();
		System.out.println("Enter the basic salary of the user: ");
		double Basic_Salary = sc.nextDouble();
		GP.set(Basic_Salary);
		GP.get();
	}
	
}