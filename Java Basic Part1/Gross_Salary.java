import java.util.Scanner;
class Gross_Salary{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basic salary of the user: ");
		double Basic_Salary = sc.nextDouble();
		double dearness_allowance = 0.4 * Basic_Salary;
		double house_rent = 0.2 * Basic_Salary;
		double Total_Salary = Basic_Salary + dearness_allowance + house_rent;
		System.out.println("The total salary of the User: "+Total_Salary);
	}
}