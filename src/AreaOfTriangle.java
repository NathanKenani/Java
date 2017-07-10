import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter base width of Triangle: ");
		float base = scan.nextFloat();
		
		System.out.println("Please enter height of triangle: ");
		float height = scan.nextFloat();
		
		// calculating the area of triangle
		float area = area(base, height);
		
		System.out.println("Area of Triangle is: " + area);
	}
	public static float area(float base, float height) 
	{
		return (base * height) / 2;
	}

}
