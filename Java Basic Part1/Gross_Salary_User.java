import java.util.Scanner;
class Gross_Salary_User{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basic salary: ");
		double Basic_Salary = sc.nextDouble();
		System.out.println("Enter the dearness allowance: ");
		double dearness_allowance = sc.nextDouble();
		System.out.println("Enter the house rent: ");
		double house_rent = sc.nextDouble();
		double Total_dearness_allowance = (dearness_allowance /100) * Basic_Salary;
		double Total_house_rent = (house_rent /100) * Basic_Salary;
		double total_salary = Basic_Salary + Total_dearness_allowance + Total_house_rent;
		System.out.println("Total Salary of the user is: "+total_salary);
	}
}
		
		
