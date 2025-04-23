import java.util.Scanner;
class Character{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch = sc.next().chatAt(0);
		if((ch >= 'A' && ch <= 'Z' )|| (ch >= 'a' && ch <= 'z'))
		{
			System.out.println("The enter character is alphabet");
		}
		else 
		{
			System.out.println("The enter character is not alphabet");
		}
	}
	
} 

/* import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // Take character input

        // Check if the character is an alphabet
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("The entered character '" + ch + "' is an alphabet.");
        } else {
            System.out.println("The entered character '" + ch + "' is NOT an alphabet.");
        }

        sc.close(); // Close the scanner
    }
} */
