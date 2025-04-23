import java.util.Scanner;
class Check{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value: ");
		char ch = sc.next() .charAt(0);
		int ascii = (int)ch;
		if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122))
			System.out.println("The value is alphabet");
		else if(ascii >= 48 && ascii <= 57)
			System.out.println("The enter value is digit");
		else
			System.out.println("The enter value is special character");
			
		
	}
}
/* You can convert characters to ASCII values using (int) char.
You can convert ASCII values to characters using (char) int.
ASCII values help classify characters as uppercase, lowercase, digits, or special characters. */