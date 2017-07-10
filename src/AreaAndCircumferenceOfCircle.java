import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[]) {
		System.out.println("Enter the radius: ");
		/* We are storing the entered radius in double
		 * because the use can enter radius in decimals
		 */
		double rad = in.nextDouble();
		
		// Area = pi*rad*rad
		double area = Math.PI * (rad * rad);
		System.out.println("The area of  circle is: " + area);
		
		// Circumference = 2 * PI * rad
		double circ = 2 * Math.PI * rad;
		System.out.println("The Circumference of Circle is: " + circ);
		
	}

}
