import java.io.InputStreamReader;
import java.io.BufferedReader;
class BSR{
	public static void main(String args[]) throws Exception 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int a = 0;
		int b = 0;
		System.out.println("Enter the value: ");
		a = Integer.parseInt(br.readLine());
		System.out.println("Enter the second value: ");
		b = Integer.parseInt(br.readLine());
		System.out.println("a= "+a+" "+"b= "+b);
	}
}
