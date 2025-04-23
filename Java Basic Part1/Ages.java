import java.util.Scanner;
class Ages{
	private int Ram;
	private int Shyam;
	private int Ajay;
	public void set(int Ram,int Shyam,int Ajay)
	{
		this.Ram = Ram;
		this.Shyam = Shyam;
		this.Ajay = Ajay;
	}
	public void Show()
	{
		if(Ram > Shyam && Ram > Shyam)
		{
			System.out.println("The Ram is youngest");
		}
		else if(Shyam > Ram && Shyam > Ajay)
		{
			System.out.println("The Shyam is youngest");
		}
		else 
		{
			System.out.println("Ajay is Youngest");
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Ages A = new Ages();
		System.out.println("Enter the age of all of three person: ");
		int Ram = sc.nextInt();
		int Shyam = sc.nextInt();
		int Ajay = sc.nextInt();
		A.set(Ram,Shyam,Ajay);
		A.Show();
		
	}
}