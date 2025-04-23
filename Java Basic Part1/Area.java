import java.util.Scanner;
class Area{
	public static float Circle_Area(float radius)
	{
		float Cir_Area = (float)3.14 * radius * radius;
		System.out.println("The area of a circle is : "+Cir_Area);
		float Cir_Perimeter = 2 * (float)3.14 * radius;
		System.out.println("The perimeter of th circle is: "+ Cir_Perimeter);
		return Cir_Perimeter;
	}
	public static float Rectangle_Area(float length, float width)
	{
		float Rec_Area = length * width;
		System.out.println("The area of the rectangle is: "+Rec_Area);
		float Rec_Perimeter = 2 * (length + width);
		System.out.println("The perimeter of the rectangle is: "+Rec_Perimeter);
		return Rec_Perimeter;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Area A1 = new Area();
		System.out.println("Enter the radius of the circle: ");
		float radius = sc . nextFloat();
		System.out.println("Enter the length and width of the circle: ");
		float length = sc.nextFloat();
		float width = sc.nextFloat();
		A1.Circle_Area(radius);
		A1.Rectangle_Area(length,width);
	}
}
 