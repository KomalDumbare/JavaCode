import java.util.Scanner;
class Complex{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int a=0,b=0,c=0,d=0;
		System.out.println("Enter the value of a,b,c,d: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		System.out.println("First complex number is: "+(a+"+"+"i"+b));
		System.out.println("Second complex number is: "+(c+"+"+"i"+d));
		System.out.println("Addition of two complex number is: "+((a+c)+("+"+"i"+(b+d))));
	}
}