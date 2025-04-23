import java.util.Scanner;
import java.io.*;
class CompoundInterest{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		double amount = sc.nextDouble();
		System.out.println("Enter the rate: ");
		double rate = sc.nextDouble();
		Sytem.out.println("Enter the time: ");
		int time= sc.nextInt();
		double CI = amount * (Math.pow((1+rate/100),time));
		System.out.println("The compound interest is: "+CI);
	}
}


/* import java.io.*; 
  
class GFG 
{ 
    public static void main(String args[]) 
    { 
        double principal = 10000, rate = 10.25, time = 5; 
  
        /* Calculate compound interest */
        double CI = principal * 
                    (Math.pow((1 + rate / 100), time)); 
          
        System.out.println("Compound Interest is "+ CI); 
    } 
} */