import java.util.Scanner;
class km_conversion{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance of the first city in km: ");
		double c1 = sc.nextDouble();
		System.out.println("Enter the distance of the Second city in km: ");
		double c2 = sc.nextDouble();
		double distance = c1 - c2;
		System.out.println("1. KM to meter \n 2. KM to centimeters \n 3. KM to inches \n 4. KM to feet  \n 5.Exit");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		switch(choice){
			case 1 : 
			double meters = distance * 1000;
			System.out.println("The km to meters conversion: "+meters);
			break;
			case 2: 
			double centimeters = distance * 100000;
			System.out.println("The km to centimeters conversion: "+centimeters);
			break;
			case 3: 
			double inches = distance * 39370.1;
			System.out.println("The meters to inches conversion: "+inches);
			break;
			case 4: 
			double feet = distance * 3280.84;
			System.out.println("The km to feet conversion: "+feet);
			break;
			default: 
			System.exit(0);
		}
	}
}
		
