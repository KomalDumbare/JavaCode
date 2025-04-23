import java.util.Scanner;
class Digit_Count{
	private int x;
	public void set(int x)
	{
		this.x = x;
	}
	public void show()
	{
		int count = 0;
		while(x != 0){
			x = x/10;
			count++;
			
			
		}
		System.out.println("The number of digit int the number is: "+count);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Digit_Count DC = new Digit_Count();
		System.out.println("Enter the number: ");
		int x = sc.nextInt();
		DC.set(x);
		DC.show();
	}

}