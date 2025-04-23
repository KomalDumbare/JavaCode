import java.util.Scanner;
import java.lang.Math;
class EMI{
	private double principle;
	private double rate;
	private int month;
	public void set(double principle, double rate, int month)
	{
		this.principle = principle;
		this.rate = rate/100 / 12;
		this.month = month;
	}
	public void show()
	{
		double EMIP = (principle * rate * Math.pow((1+rate),month))/(Math.pow((1+rate),month)-1);
		System.out.println("The total EMI pay by any person is: "+EMIP);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		EMI P = new EMI();
		System.out.println("Enter the principle amount, rate,month for calculate the EMI: ");
		double principle = sc.nextDouble();
		double rate = sc.nextDouble();
		int month = sc.nextInt();
		P.set(principle,rate,month);
		P.show();
	}
}

/*
import java.util.Scanner;
import java.lang.Math;

class EMI {
    private double principle;
    private double rate;
    private int month;

    // Method to set values
    public void set(double principle, double rate, int month) {
        this.principle = principle;
        this.rate = rate / 100 / 12; // Convert annual interest rate to monthly decimal
        this.month = month;
    }

    // Method to calculate and display EMI
    public void show() {
        double emi = (principle * rate * Math.pow((1 + rate), month)) / (Math.pow((1 + rate), month) - 1);
        System.out.println("The total EMI to be paid per month is: " + String.format("%.2f", emi));
    }

    // Main method
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        EMI loan = new EMI();

        // User input
        System.out.println("Enter the principal amount: ");
        double principle = sc.nextDouble();

        System.out.println("Enter the annual interest rate (in %): ");
        double rate = sc.nextDouble();

        System.out.println("Enter the loan tenure in months: ");
        int month = sc.nextInt();

        // Setting values and calculating EMI
        loan.set(principle, rate, month);
        loan.show();

        // Closing scanner
        sc.close();
    }
}

*/